package Factory_Method_Pattern.test;

public class PhoneFactory implements Factory {

	@Override
	public void createItem() {
		System.out.println("핸드폰 생성");
	}
}
