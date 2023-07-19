package Business_Delegate_Pattern.service.impl;

import Business_Delegate_Pattern.service.inter.BusinessService;

public class EJBService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("EJB 서비스를 호출하여 작업을 수행한다.");
	}
}
