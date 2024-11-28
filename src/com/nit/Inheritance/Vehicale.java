/*Que 1 : Simple Vehicle Inheritance in Java
===========================================

Demonstrating Inheritance to Simplify and Extend Class Functionality and 
This motto emphasizes the key educational goal of the program: to show how inheritance can be used to simplify code by 
reusing existing class functionality and extending it with new features specific to derived classes.


Define the base class Vehicle
-------------------------------

Attributes: [protected]
make: String
model: String
year: int

Constructor:
Vehicle(String make, String model, int year): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the vehicle.



Define the subclass Car Inherits from Vehicle
---------------------------------------------

Attributes: [protected]
numberOfDoors: int

Constructor:
Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.



Define the subclass Bike Inherits from Vehicle
----------------------------------------------

Attributes: [protected]
type: String

Constructor:
Bike(String make, String model, int year, String type): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.



Create Test class
-----------------
-> create main method
-> in main method create Car object and Bike object.
-> Print the details of Car class and Bike class by calling displayDetails() methods of both class.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Vehicle class OR Car class OR Bike class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input : Car car = new Car("Audi", "Q8", 2021, 4);
               System.out.println("Car Details:");
               car.displayDetails();

               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displayDetails();


sample output : 
                Car Details:
                Make: Audi
                Model: Q8
                Year: 2021
                Number of Doors: 4

                Bike Details:
                Make: Yamaha
                Model: MT-07
                Year: 2020
                Type: Sports


*/



package com.nit.Inheritance;//Package declaration




//Base class: Vehicle
public class Vehicale {
 // Protected attributes, accessible by subclasses
 protected String make;
 protected String model;
 protected int year;

 // Constructor to initialize the attributes of the vehicle
 public Vehicale(String make, String model, int year) {
     super(); // Call to Object class constructor (optional here)
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Method to display vehicle details
 void displayDetails() {
     System.out.println("Make: " + this.make); // Display the make of the vehicle
     System.out.println("Model: " + this.model); // Display the model of the vehicle
     System.out.println("Year: " + this.year); // Display the year of the vehicle
 }
}

//Subclass: Car inherits from Vehicle
class Car extends Vehicale {
 // Additional attribute specific to Car
 protected int numberOfDoors;

 // Constructor to initialize Car attributes
 public Car(String make, String model, int year, int numberOfDoors) {
     super(make, model, year); // Call Vehicle constructor to initialize common attributes

     // Validate the number of doors
     if (numberOfDoors <= 0) {
         System.out.println("Error: Invalid input for number of doors.");
     } else {
         this.numberOfDoors = numberOfDoors; // Assign valid value
     }
 }

 // Override the displayDetails method to include Car-specific details
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call Vehicle's displayDetails method
     System.out.println("Number of Doors: " + numberOfDoors); // Display number of doors
 }

 // Override toString method to provide a string representation of Car objects
 @Override
 public String toString() {
     return "Car [numberOfDoors=" + numberOfDoors + "]"; // Return Car-specific details
 }
}

//Subclass: Bike inherits from Vehicle
class Bike extends Vehicale {
 // Additional attribute specific to Bike
 protected String type;

 // Constructor to initialize Bike attributes
 public Bike(String make, String model, int year, String type) {
     super(make, model, year); // Call Vehicle constructor to initialize common attributes
     this.type = type; // Assign the type of bike
 }

 // Override the displayDetails method to include Bike-specific details
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call Vehicle's displayDetails method
     System.out.println("Bike Type: " + type); // Display the type of bike
 }
}

//Test class to demonstrate Vehicle inheritance
class VehicaleTester {
 public static void main(String[] args) {
     // Create an instance of Car
     Car car1 = new Car("Audi", "Q8", 2024, 4);
     car1.displayDetails(); // Call displayDetails method of Car

     // Create an instance of Bike
     Bike bike1 = new Bike("Royal Enfield", "Bullet", 2024, "Sport");
     bike1.displayDetails(); // Call displayDetails method of Bike
 }
}
