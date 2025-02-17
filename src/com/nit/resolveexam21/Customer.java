package com.nit.resolveexam21;

public class Customer {
	String name;
	String contactNumber;
	Reservation reservation;
	public Customer(String name, String contactNumber, Reservation reservation) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.reservation = reservation;
	}
	
	public void displayCustomerDetails() {
		System.out.println("customer name:"+name);
		System.out.println("customer number:"+contactNumber);
		reservation.displayResrvationDetails();
		if(reservation instanceof StandardReservation ) {
			System.out.println("Reservation Type: Standard");
		}
		else if(reservation instanceof DeluxeReservation) {
			System.out.println("Reservation type: Deluxe");
			
		}
		
		
	System.out.println("tota cost: "+reservation.calculateCost());
	}

}
