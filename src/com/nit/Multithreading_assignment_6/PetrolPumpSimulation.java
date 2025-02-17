package com.nit.Multithreading_assignment_6;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p1= new PetrolPump();
		
		Car [] c= {
				new Car("BMW", p1),
				new Car("thar", p1),
				new Car("odi", p1)
		};
		
		Thread th[]=new Thread[c.length];
		
		for(int i=0; i<c.length; i++) {
			th[i]=new Thread(c[i]);
		}
		
		
		for(int i=0; i<th.length; i++) {
			th[i].start();
		}
		
	}

}
