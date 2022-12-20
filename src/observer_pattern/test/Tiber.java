package observer_pattern.test;

public class Tiber implements Crew{
	@Override
	public void update(String msg) {
		System.out.println("Tiber 구독:"+msg);
	}
}
