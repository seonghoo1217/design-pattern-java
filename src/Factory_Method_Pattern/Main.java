package Factory_Method_Pattern;

import Factory_Method_Pattern.framework.Factory;
import Factory_Method_Pattern.framework.Product;
import Factory_Method_Pattern.id_card.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("이성호");
		Product card2 = factory.create("박수빈");
		card1.use();
		card2.use();
	}
}
