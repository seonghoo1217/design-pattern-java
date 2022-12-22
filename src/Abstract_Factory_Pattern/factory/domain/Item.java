package Abstract_Factory_Pattern.factory.domain;

public abstract class Item {
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}
