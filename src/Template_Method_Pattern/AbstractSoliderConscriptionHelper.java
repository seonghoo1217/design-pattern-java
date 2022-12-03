package Template_Method_Pattern;

import Template_Method_Pattern.city.Citizen;
import Template_Method_Pattern.city.Soldier;

public abstract class AbstractSoliderConscriptionHelper {
	protected abstract Citizen conscriptionCitizen(); //징집

	protected abstract void training(Citizen citizen); //징집된 군인들을 훈련

	protected abstract void supplyEquipment(Soldier soldier);

	protected abstract Soldier changeOfPosition(Citizen citizen);

	public Soldier conscription(){
		Citizen citizen= conscriptionCitizen();
		training(citizen);
		Soldier soldier=changeOfPosition(citizen);
		supplyEquipment(soldier);
		return soldier;
	}
}
