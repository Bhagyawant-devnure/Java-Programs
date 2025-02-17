package com.nit.resolveexam21;

public class Reservation {
	protected String reservationType;
	protected int night;
	
	
	
	public Reservation(String reservationType, int night) {
		
		this.reservationType = reservationType;
		this.night = night;
	}
	public double calculateCost() {
		return 0.0;
	}
public void displayResrvationDetails() {
	System.out.println("reservation type is:"+reservationType);
	System.out.println("total night:"+night);
}


}
