package Factory_Method_Pattern.test;

public class Main {
	public static void main(String[] args) {
		Factory factory1=new PhoneFactory();
		factory1.createItem();
		Factory factory2=new NoteBookFactory();
		factory2.createItem();
	}
}
