package git.tool;

import java.io.File;
import java.io.FileWriter;

public class GeneratedHTMLTemplate {
	
	public void make(String path, String name, String content, boolean existsDelete) throws Exception {
		File file = new File(path + "/" + name + ".html");
		if (existsDelete) {
			file.delete();
		} else {
			if (file.exists()) {
				System.out.println("File exists.");
			} else {
				file.createNewFile();
				
				StringBuilder builder = new StringBuilder("<!DOCTYPE html>");
				builder.append("\r\n");
				builder.append("<html>").append("\r\n");
				builder.append("<head>").append("\r\n");
				builder.append("\t").append("<meta charset=\"UTF-8\">").append("\r\n");
				builder.append("\t").append("<title>").append(name.toUpperCase()).append("</title>").append("\r\n");
				builder.append("\t").append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">").append("\r\n");
				builder.append("\t").append("<link rel=\"stylesheet\" href=\"../../stylesheets/stylesheet.css\" media=\"screen\">").append("\r\n");
				builder.append("\t").append("<link rel=\"stylesheet\" href=\"../../stylesheets/pygment_trac.css\">").append("\r\n");
				builder.append("\t").append("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>").append("\r\n");
				builder.append("\t").append("<script type=\"text/javascript\" src=\"../../javascripts/script.js\"></script>").append("\r\n");
				builder.append("\t").append("<meta name=\"description\" content=\"firstfhy\">").append("\r\n");
				builder.append("\t").append("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">").append("\r\n");
				builder.append("</head>").append("\r\n");
				builder.append("<body>").append("\r\n");
				builder.append("\t").append("<div class=\"wrapper\">").append("\r\n");
				builder.append("\t\t").append("<div class=\"container\">").append("\r\n");
				builder.append("\t\t\t").append("<div id=\"main\" role=\"main\">").append("\r\n");
				builder.append("\t\t\t\t").append("<div class=\"download-bar\">").append("\r\n");
				builder.append("\t\t\t\t\t").append("<div class=\"inner\">").append("\r\n");
				builder.append("\t\t\t\t\t\t").append("<a class=\"code\">").append(name.toUpperCase()).append("</a>").append("\r\n");
				builder.append("\t\t\t\t\t").append("</div>").append("\r\n");
				builder.append("\t\t\t\t\t").append("<span class=\"blc\"></span><span class=\"trc\"></span>").append("\r\n");
				builder.append("\t\t\t\t").append("</div>").append("\r\n");
				builder.append("\t\t\t\t").append("<article class=\"markdown-body\">").append("\r\n");
				builder.append(content);
				builder.append("\t\t\t\t").append("</article>").append("\r\n");
				builder.append("\t\t\t").append("</div>").append("\r\n");
				builder.append("\t\t").append("</div>").append("\r\n");
				builder.append("\t\t").append("<footer>").append("\r\n");
				builder.append("\t\t\t").append("<div class=\"owner\">").append("\r\n");
				builder.append("\t\t\t\t").append("<p><a href=\"https://github.com/firstfhy\" class=\"avatar\"><img src=\"https://avatars0.githubusercontent.com/u/10542465?v=3&amp;s=60\" width=\"48\" height=\"48\"></a>View <a href=\"https://github.com/firstfhy\">firstfhy</a> on <a href=\"https://www.github.com\">GitHub</a></p>").append("\r\n");
				builder.append("\t\t\t").append("</div>").append("\r\n");
				builder.append("\t\t\t").append("<div class=\"creds\">").append("\r\n");
				builder.append("\t\t\t\t").append("<small>This page generated using <a href=\"http://pages.github.com/\">GitHub Pages</a><br>theme by <a href=\"https://twitter.com/jonrohan/\">Jon Rohan</a></small>").append("\r\n");
				builder.append("\t\t\t").append("</div>").append("\r\n");
				builder.append("\t\t").append("</footer>").append("\r\n");
				builder.append("\t").append("</div>").append("\r\n");
				builder.append("</html>");
				
				FileWriter writer = new FileWriter(file);
				writer.append(builder.toString());
				writer.flush();
				writer.close();
			}
		}
	}

}
