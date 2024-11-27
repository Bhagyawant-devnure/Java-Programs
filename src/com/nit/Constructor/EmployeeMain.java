package com.nit.Constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("raj","patil",01,5000,7);
		emp1.calculateSalary();
		
		emp1.display();

	}

}
