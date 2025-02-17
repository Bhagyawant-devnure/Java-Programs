package com.nit.Assignment_15Interfacelosingcoupling;

public class TestMobile {

	private static void operateSIM(SIMCard sim, MobilePhone mb) {
		mb.inserting(sim);
		mb.makingCalls(sim);
		mb.textMessage(sim);
		mb.removingSimCard(sim);
	}
	
	
	public static void main(String[] args) {
		Jio j= new Jio();
		Airtel a = new Airtel();
		BSNL b = new BSNL();
		
		MobilePhone realme = new MobilePhoneClass();
		operateSIM(b,realme);
		
		MobilePhone apple = new MobilePhoneClass();
		operateSIM(j,apple);
		
		

	}

}
