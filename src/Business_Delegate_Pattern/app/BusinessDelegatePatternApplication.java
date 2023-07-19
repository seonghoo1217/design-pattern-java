package Business_Delegate_Pattern.app;

import Business_Delegate_Pattern.domain.BusinessDelegate;
import Business_Delegate_Pattern.domain.Client;

public class BusinessDelegatePatternApplication {
	public static void main(String[] args) {
		BusinessDelegate businessDelegate=new BusinessDelegate();
		businessDelegate.parameterizeServiceType("EJB");

		Client client=new Client(businessDelegate);
		client.taskServiceLogic();

		businessDelegate.parameterizeServiceType("JMS");
		client.taskServiceLogic();
	}
}
