package git.tool;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.Map;

public class GeneratedHTMLTemplate {
	
	public void make(File file, final Map<String, String> contents, boolean existsDelete, File template) throws Exception {
		if (existsDelete) {
			file.delete();
		} else {
			if (file.exists()) {
				System.out.println("File exists.");
				return;
			} else {
				file.createNewFile();
			}
		}
		
		ReadLineCallback callback = new ReadLineCallback() {
			
			@Override
			public String readLine(String line) {
				for (String key : contents.keySet()) {
					line = line.replace(key, contents.get(key));
				}
				return line;
			}
			
		};
		String content = readFileToString(template, callback);
		
		FileWriter writer = new FileWriter(file);
		writer.append(content);
		writer.flush();
		writer.close();
		System.out.println(file.getPath());
	}
	
	public void make(String name, Map<String, String> contents, boolean existsDelete, File template) throws Exception {
		make(new File(name), contents, existsDelete, template);
	}
	
	public String readFileToString(File file, final ReadLineCallback callback) throws Exception {
		final StringBuilder builder = new StringBuilder();
		ReadLineCallback builderCallback = new ReadLineCallback() {
			
			@Override
			public String readLine(String line) {
				builder.append(callback == null ? line : callback.readLine(line)).append("\r\n");
				return line;
			}
			
		};
		readFile(file, builderCallback);
		return builder.toString();
	}
	
	public void readFile(File file, ReadLineCallback callback) throws Exception {
		String line;
		LineNumberReader reader = new LineNumberReader(new FileReader(file));
		try {
			while ((line = reader.readLine()) != null) {
				callback.readLine(line);
			}
		} finally {
			reader.close();
		}
	}
	
	public static interface ReadLineCallback {
		
		String readLine(String line);
		
	}

}
