package Strategy_Pattern.apply;

public class SwordStrategy implements WeaponStrategy {
	@Override
	public void attack() {
		System.out.println("검으로 공격");
	}
}
