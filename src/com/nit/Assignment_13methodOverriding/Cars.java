package com.nit.Assignment_13methodOverriding;

public class Cars extends Vehical{
	int seatingCapacity;

	

	public Cars(int seatingCapacity) {
		super();
		this.seatingCapacity = seatingCapacity;
	}
@Override
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("total seating capacity: "+seatingCapacity);
    }

	
	
	
	

}
