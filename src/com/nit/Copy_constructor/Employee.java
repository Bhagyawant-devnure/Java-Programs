package com.nit.Copy_constructor;

import java.util.Scanner;

public class Employee {
    
	private int employeeId;
	private String employeename;
	private double employeeSalary;
	
	public Employee(int employeeId,String employeename,double employeeSalary) {
		super();
		this.employeeId=employeeId;
		this.employeename=employeename;
		this.employeeSalary=employeeSalary;
		
	}
	public static Employee getEmployeeObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int employeeId = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String employeename = sc.nextLine();
		employeename = sc.nextLine();
		
		
		System.out.println("Enter employee salary");
		double employeeSalary=sc.nextDouble();
		
		return new Employee(employeeId,employeename,employeeSalary);
		
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
}


