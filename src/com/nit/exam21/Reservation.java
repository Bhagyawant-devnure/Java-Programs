/*Scenario 1: Hotel Reservation System

Base Class: Reservation
------------------------------
Create a Parent class Reservation  It holds common attributes for reservations and provides methods for displaying details and calculating costs (to be overridden in subclasses).

Attributes :
reservationType (String): The type of reservation (e.g., "Standard", "Deluxe").

nights (int): The number of nights the room is booked for.

Constructor
Parameterized Constructor: Initializes the reservation type and the number of nights.

Methods
public double calculateCost(): Returns 0.0 (to be overridden in subclasses).
public void displayReservationDetails(): Displays the details of the reservation, including type and nights booked.

StandardReservation (Subclass of  Reservation)
-----------------------------------------------

Attributes
No additional attributes.

Constructor
Parameterized constructor to initialize the parent attributes using super().

Methods
Override calculateCost(): Calculates and returns the cost for a standard reservation (nights * 2000).
Subclass: DeluxeReservation (extends Reservation)

Attributes
No additional attributes.

Constructor
Parameterized constructor to initialize the parent attributes using super().

Methods
Override calculateCost(): Calculates and returns the cost for a deluxe reservation (nights * 4000).


Customer Class
----------------

Attributes
name (String): The name of the customer.
contactNumber (String): The contact number of the customer.
reservation (Reservation): A Reservation object demonstrating the HAS-A relationship.

Constructor
Parameterized constructor to initialize the attributes.

Methods
public void displayCustomerDetails(): Displays customer details, including their associated reservation information, and uses the instanceof operator to check the reservation type and calculate the cost based on the reservation type.

Main Class: HotelReservationSystem
-----------------------------------

Creates Reservation objects (both Standard and Deluxe).
Creates Customer objects that use those Reservation objects.
Displays the details of each customer using the displayCustomerDetails() method.


SAMPLE INPUT:
==============

Reservation Details:
---------------------
Customer 1 Reservation:
    Reservation Type: Standard
    Nights: 4

Customer 2 Reservation:
   Reservation Type: Deluxe
   Nights: 5


Customer Details:
------------------
Customer 1:
Name: Alice Johnson
Contact Number: 9876543210
Reservation: StandardReservation with 4 nights

Customer 2:
Name: Bob Williams
Contact Number: 8765432109
Reservation: DeluxeReservation with 5 nights

*/

package com.nit.exam21;

public class Reservation {
	
	    private String type;
	    private int nights;

	    public Reservation(String type, int nights) {
	        this.type = type;
	        this.nights = nights;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getNights() {
	        return nights;
	    }

	    public double calculateCost() {
	        if (type.equalsIgnoreCase("Standard")) {
	            return nights * 2000.0;
	        } else if (type.equalsIgnoreCase("Deluxe")) {
	            return nights * 4000.0;
	        }
	        return 0.0;
	    }
	}



