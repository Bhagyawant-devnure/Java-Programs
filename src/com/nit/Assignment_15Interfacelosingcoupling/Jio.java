package com.nit.Assignment_15Interfacelosingcoupling;

public class Jio implements SIMCard {
	private long phoneNumber;

	
	public long gettingPhoneNumber() {
		
		return 0;
	}

	
	public void networkProvider() {
	
		System.out.println("network provider jio");
	}

	
	public void activation() {
		System.out.println("sim activeted");
		
	}


	public void deActivation() {
		
		System.out.println("sim deactiveted");
	}


	@Override
	public boolean isActive() {
		
		return false;
	}
	

}
