package Strategy_Pattern.apply;

public class CharacterStrategy {
	private WeaponStrategy weaponStrategy;

	//교환성 보장
	public void setWeaponStrategy(WeaponStrategy weaponStrategy){
		this.weaponStrategy=weaponStrategy;
	}

	public void characterAct() {
		weapon_type(weaponStrategy);
	}

	private void weapon_type(WeaponStrategy weaponStrategy){
		if (weaponStrategy==null){
			System.out.println("맨손 공격");
			return;
		}
		weaponStrategy.attack();
	}
}
