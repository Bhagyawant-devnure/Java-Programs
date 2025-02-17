package com.nit.Assignment_15Interfacelosingcoupling;

import java.util.Random;

public class MobilePhoneClass implements MobilePhone {

	@Override
	public void inserting(SIMCard sim) {
		if(sim.isActive()==false) {
			sim.activation();
			System.out.println("sim card is activeted");
			System.out.println("sim card inserted");
			sim.networkProvider();
		}	
		else {
			System.out.println("sim is already inserted");
		}
	}

	@Override
	public void removingSimCard(SIMCard sim) {
		if(sim.isActive()) {
			sim.deActivation();
			System.out.println("sim card is remove");
		}
		else {
			System.out.println("sim is not available");
		}
		
	}

	@Override
	public void makingCalls(SIMCard sim) {
		if(sim.isActive()) {
			System.out.println("calling form"+sim.gettingPhoneNumber()+"to"
					+new Random().nextLong(8411849785l,9524953509l));
		}
		else {
			System.out.println("sim card is not avaialble");
		}
	}

	@Override
	public void textMessage(SIMCard sim) {
		// TODO Auto-generated method stub
		if(sim.isActive()) {
			System.out.println("texting form"+sim.gettingPhoneNumber()+"to"
					+new Random().nextLong(8411849785l,9524953509l));
		}
		else {
			System.out.println("sim card is not avaialble");
		}
		
	}


	

}
