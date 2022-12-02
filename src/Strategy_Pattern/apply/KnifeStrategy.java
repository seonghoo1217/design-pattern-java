package Strategy_Pattern.apply;

public class KnifeStrategy implements WeaponStrategy {
	@Override
	public void attack() {
		System.out.println("칼로 공격");
	}
}
