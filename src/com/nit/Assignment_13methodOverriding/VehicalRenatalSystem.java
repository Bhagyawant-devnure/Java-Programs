package com.nit.Assignment_13methodOverriding;

public class VehicalRenatalSystem {

	public static void main(String[] args)
	{
		 Vehical v1 = new Vehical("Car", 1000, true);
	        v1.displayDetails();

	        Cars car1 = new Cars(2000);
	        car1.displayDetails();

	        Bike bike1 = new Bike(500);
	        bike1.displayDetails();

	        Truck truck1 = new Truck(3000);
	        truck1.displayDetails();

	        Customer cust = new Customer("Bhagywant", "726423462");
	        cust.displayDetails();
	        cust.bookVehical();

}}
