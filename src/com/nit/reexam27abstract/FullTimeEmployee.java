package com.nit.reexam27abstract;

public  class FullTimeEmployee extends Employee{
	private double monthSalary;
	public FullTimeEmployee(int employeeId, String name,double monthSalary) {
		super(employeeId, name);
		this.setMonthSalary(monthSalary);
		
	}
	public double getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	public void showDetails() {
		System.out.println("enter id:"+getEmployeeId());
		System.out.println("enter name:"+getName());
		
		System.out.println("month salary:"+monthSalary);
		
	}
	
	
	@Override
	public double calculateSalary() {
	
		return monthSalary;
	}

	
	
	

}
