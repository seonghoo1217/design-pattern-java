package Prototype_Pattern;

public interface Product extends Cloneable{
	void use(String s);
	Product createClone();
}
