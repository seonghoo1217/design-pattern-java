package Prototype_Pattern.impl;

import Prototype_Pattern.Product;

public class MessageBox implements Product {

	private char deco_char;

	public MessageBox(char deco_char) {
		this.deco_char = deco_char;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(deco_char);
		}
		System.out.println("");
		System.out.println(deco_char + " " + s + " " + deco_char);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(deco_char);
		}
		System.out.println(" ");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
