package Strategy_Pattern.non_apply;

public class Sword implements Weapon{
	@Override
	public void attack() {
		System.out.println("칼로 찌르기");
	}
}
