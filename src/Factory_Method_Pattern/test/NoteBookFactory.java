package Factory_Method_Pattern.test;

public class NoteBookFactory implements Factory{

	@Override
	public void createItem() {
		System.out.println("노트북 만듬");
	}
}
