package com.nit.Assignment_15Interfacelosingcoupling;

public class Airtel implements SIMCard{
	private long phoneNumber;
	
	public long gettingPhoneNumber() {
		 
		return phoneNumber ;
	}

	
	public void networkProvider() {
		System.out.println("network provider Airtel");
		
	}

	
	public void activation() {
		System.out.println("sim activated");
		
	}

	
	public void deActivation() {
		System.out.println("sim deactive");
		
	}


	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

}
