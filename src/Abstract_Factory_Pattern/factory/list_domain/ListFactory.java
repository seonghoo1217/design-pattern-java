package Abstract_Factory_Pattern.factory.list_domain;

import Abstract_Factory_Pattern.factory.Factory;
import Abstract_Factory_Pattern.factory.domain.Link;
import Abstract_Factory_Pattern.factory.domain.Page;
import Abstract_Factory_Pattern.factory.domain.Tray;

public class ListFactory  extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title,author);
	}
}
