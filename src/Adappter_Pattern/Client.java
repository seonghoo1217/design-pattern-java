package Adappter_Pattern;

public class Client {
	public static void main(String[] args) {
		MathAdapter mathAdapter=new MathFloat();
		System.out.println(mathAdapter.twiceAdapter(100f));
		System.out.println(mathAdapter.halfAdapter(50f));
	}
}
