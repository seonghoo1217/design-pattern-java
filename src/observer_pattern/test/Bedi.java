package observer_pattern.test;

import java.util.ArrayList;
import java.util.List;

public class Bedi implements Coach{
	private List<Crew> crews=new ArrayList<>();

	public void eatFood(){
		System.out.println("베디 코치가 밥을 먹는다");
		notifyCrew("나 밥먹었어");
	}

	public void runAway(){
		System.out.println("베디 코치가 농땡이 친다");
		notifyCrew("나 농땡이쳤어");
	}

	public void updateCombat(){
		System.out.println("베디가 나노강화제를 주입했다");
		notifyCrew("너흰 강해졌다 돌격해");
	}

	@Override
	public void subscribe(Crew crew) {
		crews.add(crew);
	}

	@Override
	public void unsubscrib(Crew crew) {
		crews.remove(crew);
	}

	@Override
	public void notifyCrew(String msg) {
		crews.forEach(crew -> crew.update(msg));
	}
}
