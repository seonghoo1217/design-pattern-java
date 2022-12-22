package Abstract_Factory_Pattern.factory.list_domain;

import Abstract_Factory_Pattern.factory.domain.Item;
import Abstract_Factory_Pattern.factory.domain.Page;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<ul>\n");
		for (Object o : content) {
			Item item = (Item) o;
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}
}
