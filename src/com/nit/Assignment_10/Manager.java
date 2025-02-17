package com.nit.Assignment_10;

public class Manager {
	int managerId;
	String managerName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	
	
	public Manager(int managerId, String managerName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}



	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer + projectAllowance;
	}

}
