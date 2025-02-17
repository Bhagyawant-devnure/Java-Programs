package com.nit.Assignment_10;

public class TaxCalculation {

	public static void main(String[] args) {
		Employee e = new Employee (01,"virat",3000,5000,100,200);
		Manager m = new Manager (02,"sachin",3000,5000,100, 10);
		Trainer t = new Trainer (01,"dhoni",3000,5000,100,500,2);
		Sourcing s = new Sourcing (01,"dhoni",3000,5000,100,500,2, 15);
		
		
		TaxUtil tx=new TaxUtil();
		System.out.println("Employee total tax " + tx.calculateTax(e));
		System.out.println("Manager total tax " + tx.calculateTax(m));
		System.out.println("Trainer total tax is " + tx.calculateTax(t));
		System.out.println("Sourcing tax is " + tx.calculateTax(s));
		
		
		
		

	}

}
