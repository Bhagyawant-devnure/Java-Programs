package com.nit.resolveexam21;

public class StandardReservation extends Reservation{

	
	public StandardReservation(String reservationType, int night) {
		super(reservationType, night);
	}

	@Override
	public double calculateCost() {
		return night*2000;
	}

}
