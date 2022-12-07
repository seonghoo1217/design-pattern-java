package Factory_Method_Pattern.id_card;

import Factory_Method_Pattern.framework.Factory;
import Factory_Method_Pattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard)p).getOwner());
	}
}
