package git.tool;

import java.io.File;

public class BlogMaker extends GeneratedHTMLTemplate {
	
	public static void main(String[] args) {
		try {
			new BlogMaker().make("nginx", "nginx_reload", "", true);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void make(String path, String name, String content, boolean existsDelete) throws Exception {
		File file = new File(BlogMaker.class.getResource("../../").toURI());
		super.make(file.getParentFile().getParent() + "/program/" + path, name, "", false);
	}

}
