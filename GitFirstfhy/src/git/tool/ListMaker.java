package git.tool;

public class ListMaker extends GeneratedHTMLTemplate {
	
	public void make() {
		
	}

	@Override
	public void make(String path, String name, String content, boolean existsDelete) throws Exception {
		super.make("../../" + path, name, content, true);
	}

}
