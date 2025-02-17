package com.nit.exam21;

public class HotelReservationSystem {

	

	public static void main(String[] args) {
		  Reservation standardReservation = new Reservation("Standard", 4);
	        Reservation deluxeReservation = new Reservation("Deluxe", 5);

	        Customer customer1 = new Customer("bhagyawant", "9876543210", standardReservation);
	        Customer customer2 = new Customer("dipak", "8765432109", deluxeReservation);

	        System.out.println("Customer 1 Details:");
	        customer1.displayCustomerDetails();
	        System.out.println();

	        System.out.println("Customer 2 Details:");
	        customer2.displayCustomerDetails();
	}

}
