package com.nit.Multithreading_assignment_6;

public class PetrolPump {
	
	synchronized public void refillCar(String carName) {
		try {
			System.out.println(carName+"Started refilling");
			Thread.sleep(3000);
			;
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(carName+"completed refilling!");
	}

}
 class Car implements Runnable{
	 String name;
	 PetrolPump petrolPump;
	 

	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}


	@Override
	public void run() {
	petrolPump.refillCar(name);
		
	}
	 
 }
