package com.Enum.Method_Overriding;

public class Tester {

	public static void main(String[] args) {
		 Manager manager1 = new Manager("Alice", 101, 8000, ManagerType.Hr);
	        Manager manager2 = new Manager("Bob", 102, 7000, ManagerType.Sales);

	        // Creating Clerks
	        Clerk clerk1 = new Clerk("John", 201, 4000, 75, 85);
	        Clerk clerk2 = new Clerk("Sarah", 202, 4000, 60, 75);

	        // Display Initial Salaries
	        System.out.println(manager1);
	        System.out.println(manager2);
	        System.out.println(clerk1);
	        System.out.println(clerk2);

	        // Updating Clerk's Speed & Accuracy
	        System.out.println("\nUpdating Clerk's Speed & Accuracy:");
	        clerk2.setSpeed(80); // Won't get bonus as accuracy < 80
	        clerk2.setAccuracy(85); // Now qualifies for bonus
	        
	     // Display Updated Salaries
	        System.out.println("\nAfter Updating Speed & Accuracy:");
	        System.out.println(clerk2);
	
	
}

	}


