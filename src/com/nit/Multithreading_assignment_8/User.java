package com.nit.Multithreading_assignment_8;

public class User {
private String name;
private VaccineEligibility eligibility;

private DoseBooking doseBooking;

public User(String name, int age,boolean hasHealthCondition) {
	
	this.name = name;
	this.eligibility = new VaccineEligibility(age, hasHealthCondition);
	this.doseBooking = new DoseBooking();
}

//Method to check if the user is eligible
public boolean isEligible() {
	return eligibility.isEligible();
}
//Method to book a dose if eligible
public void bookDose() {
	if(!isEligible()) {
	throw new RuntimeException(name+"you are not eligible for vaccine");
	}
	 synchronized (this) { // Ensuring thread safety during booking
         doseBooking.bookDose(name);
         System.out.println("Dose booked successfully for " + name);}

}
//Method to check if the dose is already booked
public boolean isDoseBooked() {
	return doseBooking.isDoseBooked();
	
}}