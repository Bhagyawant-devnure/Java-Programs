package com.nit.resolveexam21;

public class DeluxeReservation extends Reservation {

	public DeluxeReservation(String reservationType, int night) {
		super(reservationType, night);
	}

	@Override
	public double calculateCost() {
		return night*2000;
	}
}
