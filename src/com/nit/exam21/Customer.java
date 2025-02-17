package com.nit.exam21;

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
		System.out.println("reservation type"+reservation);
		 System.out.println("Reservation Type: " + reservation.getType());
	        System.out.println("Number of Nights: " + reservation.getNights());
	        System.out.println("Number of Nights: " + reservation.calculateCost());
	        
	}

}
