package Business_Delegate_Pattern.service.impl;

import Business_Delegate_Pattern.service.inter.BusinessService;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JMS 서비스 조회");
	}
}
