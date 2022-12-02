package Strategy_Pattern.apply;

public class Main {
	public static void main(String[] args) {
		CharacterStrategy character=new CharacterStrategy();
		character.characterAct();

		character.setWeaponStrategy(new KnifeStrategy());
		character.characterAct();

		character.setWeaponStrategy(new SwordStrategy());
		character.characterAct();
	}
}
