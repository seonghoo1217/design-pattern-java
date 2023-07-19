package Business_Delegate_Pattern.service.select;

import Business_Delegate_Pattern.service.impl.EJBService;
import Business_Delegate_Pattern.service.impl.JMSService;
import Business_Delegate_Pattern.service.inter.BusinessService;

public class BusinessLookUp {

	public BusinessService 	getBusinessService(String serviceType){
		if (serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else {
			return new JMSService();
		}
	}
}
