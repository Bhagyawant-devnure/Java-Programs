

package com.nit.Multithreading_assignment_4;

public class RideRequest extends Thread {
	@Override
	public void run(){
		try {
			System.out.println("User requested a ride...");
			Thread.sleep(2000);
			System.out.println("Searching for nearby drivers...");
			
		
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class DriverAssignment extends Thread{
	
	public void run() {
		
		try {
			
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!...");
		}
		catch(InterruptedException e) {
			
		}
	}
}

class FareCalculation extends Thread{
 public void run() {
	 try {
		 System.out.println("Calculationg estimated fare...");
		 Thread.sleep(1500);
		 System.out.println("Estimated fare: 135.75 Rs");
	 }
	 catch(InterruptedException e){
		 e.printStackTrace();
		 
	 }
 }
}

class LiveTracking extends Thread{
	public void run() {
		try {
		for(int i=20;i<=100;i=i+20) {
			
			Thread.sleep(1000);
			System.out.println("updaying ride location..."+i+"%");
			
		}
	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ride competed");
	}
}

class PaymentProcessing extends Thread{
	public void run() {
		try {
			System.out.println("Processing Payment...");
			Thread.sleep(2000);
			System.out.println("Payment successful!");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class RatingSystem extends Thread{
	public void run() {
		try {
			System.out.println("Requesting user rating...");
			Thread.sleep(1000);
			System.out.println("User rated ride: 5 star***");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
