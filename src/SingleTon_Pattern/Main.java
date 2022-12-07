package SingleTon_Pattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("instance1과 instance2 동일성 비교::"+(instance1==instance2));
		System.out.println("end");
	}
}
