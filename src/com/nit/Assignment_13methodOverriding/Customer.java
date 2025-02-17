package com.nit.Assignment_13methodOverriding;

import java.lang.classfile.Superclass;
import java.util.Scanner;

public class Customer extends Vehical{

	 String customerName;
	 String contactNumber;
	private Vehical vehical;
	 final static Scanner sc = new Scanner(System.in);
	 
	public Customer(String customerName, String contactNumber) {
		super();
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}
	
	public void displayDetails() 
	{
		System.out.println("customer name:"+customerName);
		System.out.println("customer number:"+contactNumber);
		
	}
	 
	public void bookVehical()
	{
		
		{
			System.out.println("Vehical is available!!!");
			System.out.println("\t\t 1. Car");
			System.out.println("\t\t 2. Bike");
			System.out.println("\t\t 3. Truck");
			System.out.print("What do you want to rent :");
			int choice = sc.nextInt();
			
			switch (choice) 
			{
			case 1: 
			{
				System.out.println("You choose car");
				System.out.print("For how many days you want car on ren :");
				int rentDays = sc.nextInt();
				Vehical car = new Vehical("Car",1000,true);
				double cost = car.CalculatecostPerDay(rentDays);
				System.out.println("Total you have to pay :"+cost);
				break;
				}
			 case 2: {
	                System.out.println("You chose Bike");
	                System.out.print("For how many days do you want to rent the bike? Enter days: ");
	                int rentDays = sc.nextInt();
	                Vehical bike = new Vehical("Bike", 500, true);
	                double cost = bike.CalculatecostPerDay(rentDays);
	                System.out.println("Total Cost: " + cost);
	                break;
	                }
			 case 3: {
	                System.out.println("You chose Truck");
	                System.out.print("For how many days do you want to rent the truck? Enter days: ");
	                int rentDays = sc.nextInt();
	                Vehical truck = new Vehical("Truck", 3000, false);
	                double cost = truck.CalculatecostPerDay(rentDays);
	                System.out.println("Total Cost: " + cost);
	                break;
			}
			 default:
	                System.out.println("Invalid choice! Please try again.");
			
		}
		}
		
	}
	
	
}
