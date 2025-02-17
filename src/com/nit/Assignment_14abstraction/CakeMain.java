package com.nit.Assignment_14abstraction;

public class CakeMain {

	public static void main(String[] args) {
		OrderCake oc1 = new OrderCake("Square","Choclate", 2);
		oc1.showCake();
		OrderCake oc2 = new OrderCake("heart","venilla",5);
		oc2.showCake();
		OrderCake oc3 = new OrderCake("square","venilla",6,"happy birth day");
		oc3.showCake();
		


	}

}
