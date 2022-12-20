package observer_pattern.test;

public class Lewin implements Crew{

	@Override
	public void update(String msg) {
		System.out.println("Lewin 구독:"+msg);
	}
}
