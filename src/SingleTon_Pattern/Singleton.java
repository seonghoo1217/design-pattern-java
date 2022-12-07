package SingleTon_Pattern;

public class Singleton {
	private static Singleton singleton=new Singleton();

	private Singleton(){
		System.out.println("created Singleton");
	}

	public static Singleton getInstance(){
		return singleton;
	}
}
