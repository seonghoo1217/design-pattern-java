package Business_Delegate_Pattern.domain;

public class Client {
	BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate){
		this.businessDelegate=businessDelegate;
	}

	public void taskServiceLogic(){
		businessDelegate.taskServiceLogic();
	}
}
