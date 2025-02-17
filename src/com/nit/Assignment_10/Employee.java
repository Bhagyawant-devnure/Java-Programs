package com.nit.Assignment_10;

public class Employee {
	int employeeId;
	String employeeName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	
	
	public Employee(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}



	public double calculateGrossSalary() {
		return basicSalary + HRAPer+DAPer+projectAllowance;
		
	}



	
	

}
