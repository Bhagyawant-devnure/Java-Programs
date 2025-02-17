package com.nit.resolveexam21;

public class PremiumJobPortal extends JobPortal {
	
	int subscriptionFee=2000;
	
	
	public PremiumJobPortal(String portalName, boolean isPremium, int subscriptionFee, int subscriptionFee2) {
		super(portalName, isPremium, subscriptionFee);
		subscriptionFee = subscriptionFee2;
	}


	public int calculateEarnings(int...users) {
		return subscriptionFee;
		
	}

}
