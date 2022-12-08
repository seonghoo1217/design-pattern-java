package Prototype_Pattern;

import java.util.HashMap;

public class Manager {
	private final HashMap<String, Product> showcase=new HashMap<>();
	public void register(String name,Product proto){
		showcase.put(name,proto);
	}

	public Product create(String proto_name){
		Product p = showcase.get(proto_name);
		return p.createClone();
	}

}
