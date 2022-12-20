package observer_pattern.test;

public class Jay implements Crew{
	@Override
	public void update(String msg) {
		System.out.println("Jay 구독:"+msg);
	}
}
