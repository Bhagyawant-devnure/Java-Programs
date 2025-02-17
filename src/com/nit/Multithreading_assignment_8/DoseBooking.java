package com.nit.Multithreading_assignment_8;

public class DoseBooking {
	private boolean booked=false;
	
    // Synchronized method to book a dose
	public synchronized void bookDose(String username) {
		
			if(booked) {
				
				throw new RuntimeException("Does already booked"+username);
				
			} 
			
			
			booked =true;
			System.out.println("dose booked succesfully"+username);
			
		}
	// Method to check if the dose is already booked
	public boolean isDoseBooked() {
		return booked;
	}

}
