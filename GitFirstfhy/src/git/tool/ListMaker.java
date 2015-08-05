package git.tool;

import java.io.File;

public class ListMaker extends GeneratedHTMLTemplate {
	
	public void make() throws Exception {
		File file = new File(BlogMaker.class.getResource("../../").toURI());
		make(file);
	}
	
	public void make(File file) throws Exception {
		if (file.isDirectory()) {
			
		} else {
			
		}
	}

	@Override
	public void make(String path, String name, String content, boolean existsDelete) throws Exception {
		super.make(path, name, content, true);
	}

}
