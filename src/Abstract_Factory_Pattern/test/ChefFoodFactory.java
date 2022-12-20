package Abstract_Factory_Pattern.test;

public class ChefFoodFactory implements FoodAbstractFactory {
	@Override
	public void createSauce() {
		System.out.println("소스 만들기");
	}

	@Override
	public void createSalad() {
		System.out.println("샐러드 만들기");
	}

	@Override
	public void createStake() {
		System.out.println("스테이크 만들기");
	}
}
