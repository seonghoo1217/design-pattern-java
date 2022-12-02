package Strategy_Pattern.non_apply;

public class Character {
	public void characterAct() {
		Weapon knife = new Knife();
		Weapon sword = new Sword();

		knife.attack();
		sword.attack();

		//이후 모든 출력문을 종류+공격으로 출력하고 싶을 때
	}
}
