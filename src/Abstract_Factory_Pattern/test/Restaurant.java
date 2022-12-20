package Abstract_Factory_Pattern.test;

public class Restaurant {
	private String food;
	public void getOrder(){
		FoodAbstractFactory chefA = new ChefFoodFactory();
		switch (food){
			case "salad":
				chefA.createSalad();
				break;
			case "sauce":
				chefA.createSauce();
				break;
			case "stake":
				chefA.createStake();
				break;
		}
	}

	public Restaurant(String food) {
		this.food=food;
	}
}
