package com.nit.Multithreading_assignment_8;

public class VaccineEligibility {
	private int age;
	boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	  // Method to check if the user is eligible for vaccination
	public boolean isEligible() {
		return age>=18&&(age<60 )|| hasHealthCondition;
	}
	

}
