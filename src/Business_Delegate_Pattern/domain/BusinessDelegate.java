package Business_Delegate_Pattern.domain;

import Business_Delegate_Pattern.service.inter.BusinessService;
import Business_Delegate_Pattern.service.select.BusinessLookUp;

public class BusinessDelegate {
	private BusinessLookUp lookUp=new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void parameterizeServiceType(String serviceType){
		this.serviceType=serviceType;
	}

	public void taskServiceLogic(){
		businessService = lookUp.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
