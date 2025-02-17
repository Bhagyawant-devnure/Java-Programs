package com.nit.resolveexam21;

public class HotelReservationSystem {

	

	public static void main(String[] args) {
		Reservation StandardReservation = new StandardReservation("Standard",5);
		Reservation DeluxeReservation = new DeluxeReservation("Deluxe",4);
		
		Customer c1= new Customer("raj","123456",StandardReservation);
		Customer c2 =  new Customer("bhagyawant","8411849785",DeluxeReservation);
		
		c1.displayCustomerDetails();
		c2.displayCustomerDetails();

	}

}
