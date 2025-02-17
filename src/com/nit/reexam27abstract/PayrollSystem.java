package com.nit.reexam27abstract;

public class PayrollSystem {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee= new FullTimeEmployee (1,"bhagyawnt",50000.0);
		  PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "dibak", 200.00,2);


	        System.out.println("Full-Time Employee Details:");
	        fullTimeEmployee.showDetails();
	        System.out.println("Calculated Salary: " + fullTimeEmployee.calculateSalary());
	        System.out.println();

	        
	        System.out.println("Part-Time Employee Details:");
	        partTimeEmployee.showDetails();
	        System.out.println("Calculated Salary: " +  partTimeEmployee.calculateSalary());
	}

}
