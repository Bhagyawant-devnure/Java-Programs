package com.nit.Multithreading_assignment_4;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException {
		
		RideRequest r1 = new RideRequest();
		
		DriverAssignment dr = new DriverAssignment();
		
		FareCalculation fa = new FareCalculation();
		
		LiveTracking li = new LiveTracking();
		
		PaymentProcessing  pay = new PaymentProcessing(); 
		
		 RatingSystem rat = new RatingSystem();
		 
		r1.start();
	//	r1.join();
		
		fa.start();
		fa.join();
		
		
		dr.start();
		dr.join();
		
		
	
		li.start();
		li.join();
		
		pay.start();
		pay.join();
		
		rat.start();
		
		

	}

}
