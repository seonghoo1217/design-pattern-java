package observer_pattern.test;

public class Main {
	public static void main(String[] args) {
		Bedi bedi = new Bedi();
		Crew jay = new Jay();
		Crew lewin = new Lewin();
		Crew tiber = new Tiber();

		bedi.subscribe(jay);
		bedi.subscribe(lewin);
		bedi.subscribe(tiber);

		bedi.updateCombat();

		bedi.unsubscrib(tiber);
		bedi.runAway();
	}
}
