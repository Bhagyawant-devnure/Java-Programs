package com.nit.Assignment_13methodOverriding;

public class Truck extends Vehical {
	double loadCapacity;

	public Truck(double loadCapacity) {
		super();
		this.loadCapacity = loadCapacity;
	}
	
public void displayDetails() {
super.displayDetails();
System.out.println("Total Loading is:"+loadCapacity);
}
}
