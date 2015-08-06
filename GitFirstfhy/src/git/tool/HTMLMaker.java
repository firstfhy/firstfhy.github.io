package git.tool;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;

public class HTMLMaker extends GeneratedHTMLTemplate {
	
	public static void main(String[] args) {
		if (args == null || args.length < 3) {
			args = new String[]{"../../../../program", "content/rule.txt", "template.html"};
		}
		
		try {
			new HTMLMaker().make(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void make(String[] args) throws Exception {
		File target = find(args[0]);
		File rule = new File(getClass().getResource(args[1]).toURI());
		target.mkdirs();
		loadRule(rule, target);
		makeIndex(target, find(args[2]));
	}
	
	private File find(String target) throws Exception {
		int count = 0;
		while (target.contains("../")) {
			target = target.replaceFirst("../", "");
			count++;
		}
		File file = new File(getClass().getResource("").toURI());
		for (;count > 0;count--) {
			file = file.getParentFile();
		}
		return new File(file, target);
	}
	
	private void loadRule(File rule, final File target) throws Exception {
		ReadLineCallback callback = new ReadLineCallback() {
			
			@Override
			public String readLine(String line) {
				line = line.trim();
				if (line.length() > 0) {
					String[] infos = line.split(" ");
					
					File file = new File(target, infos[0]);
					file.getParentFile().mkdirs();
					try {
						File template = find(infos[1]);
						Map<String, String> contents = new HashMap<String, String>();
						contents.put("[content]", readFileToString(find(infos[2]), null));
						contents.put("[code]", file.getParentFile().getName().toUpperCase());
						for (int i = 3;i < infos.length;i++) {
							String[] content = infos[i].split("-");
							contents.put(content[0], content[1]);
						}
						makeContentHTML(file, template, contents);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return line;
			}
			
		};
		
		readFile(rule, callback);
	}
	
	private void makeContentHTML(File target, File template, Map<String, String> contents) throws Exception {
		make(target, contents, true, template);
	}
	
	private String[] makeIndex(File target, File template) throws Exception {
		String name = target.getName();
		
		StringBuilder content = new StringBuilder("<ol>");
		content.append("\r\n");
		for (File file : target.listFiles()) {
			String fileName = file.getName().replace(".html", "");
			if (file.isDirectory()) {
				String[] infos = makeIndex(file, template);
				content.append("\t").append("<li><a href=\"").append(infos[0]).append("/").append(infos[0]).append(".html\">").append(infos[1]).append("</a></li>").append("\r\n");
			} else if (!fileName.equals(target.getName())) {
				Parser parser = new Parser(file.getPath());
				parser.setEncoding("utf-8");
				NodeIterator iterator = parser.elements();
				String title = getTitle(iterator);
				content.append("\t").append("<li><a href=\"").append(file.getName()).append(".html\">").append(title).append("</a></li>").append("\r\n");
			}
		}
		content.append("</ol>");
		
		String title = name.toUpperCase();
		
		Map<String, String> contents = new HashMap<String, String>();
		contents.put("[title]", title);
		contents.put("[content]", content.toString());
		
		make(new File(target, target.getName() + ".html"), contents, true, template);
		
		return new String[]{name, title};
	}
	
	private String getTitle(NodeIterator iterator) throws Exception {
		while (iterator.hasMoreNodes()) {
			Node node = iterator.nextNode();
			if (node.getText().equals("title")) {
				return node.getFirstChild().getText();
			} else {
				NodeList nodeList = node.getChildren();
				if (nodeList != null) {
					return getTitle(nodeList.elements());
				}
			}
		}
		return "";
	}

}
