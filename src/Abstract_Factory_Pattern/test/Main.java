package Abstract_Factory_Pattern.test;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant("salad");
		restaurant.getOrder();
		restaurant=new Restaurant("stake");
		restaurant.getOrder();
		restaurant=new Restaurant("sauce");
		restaurant.getOrder();
	}
}
