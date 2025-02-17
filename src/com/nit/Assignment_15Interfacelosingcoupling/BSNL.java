package com.nit.Assignment_15Interfacelosingcoupling;

public class BSNL implements SIMCard{

	private long phoneNumber;
	public long gettingPhoneNumber() {
		
		return phoneNumber;
	}

	
	public void networkProvider() {
		System.out.println("network provider is BSNL");
		
	}

	
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("sim activated");
	}

	
	public void deActivation() {
		// TODO Auto-generated method stub
		System.out.println("sim deactivated");
	}


	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

}
