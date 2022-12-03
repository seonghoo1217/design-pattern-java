package Template_Method_Pattern.city;

public class Gun implements Weapon{
	@Override
	public void attack() {
		System.out.println("사격 개시");
	}
}
