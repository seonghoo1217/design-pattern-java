package Template_Method_Pattern;

import Template_Method_Pattern.city.Citizen;
import Template_Method_Pattern.city.Gun;
import Template_Method_Pattern.city.Soldier;
import Template_Method_Pattern.city.SteelArmor;

public class SoldierConscriptionHelperImpl extends AbstractSoliderConscriptionHelper{

	@Override
	protected Citizen conscriptionCitizen() {
		System.out.println("징집");
		return new Citizen();
	}

	@Override
	protected void training(Citizen citizen) {
		citizen.updateStrength(5);
		citizen.updateAgility(4);
		citizen.updateIntelligence(-3);
		System.out.println("병사 훈련");
	}

	@Override
	protected void supplyEquipment(Soldier soldier) {
		soldier.setWeapon(new Gun());
		soldier.setArmor(new SteelArmor());
		System.out.println("장비 보급!");
	}

	@Override
	protected Soldier changeOfPosition(Citizen citizen) {
		System.out.println("시민에서 병사로 보직변경");
		return new Soldier(citizen);
	}
}
