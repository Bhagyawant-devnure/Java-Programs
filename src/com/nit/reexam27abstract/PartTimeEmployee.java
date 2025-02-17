package com.nit.reexam27abstract;

public  class PartTimeEmployee extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	
	public PartTimeEmployee(int employeeId, String name,double hourlyRate,int hoursWorked) {
		super(employeeId, name);
		this.setHourlyRate(hourlyRate);
		this.setHoursWorked(hoursWorked);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void showDetails() {
		System.out.println("enter id:"+getEmployeeId());
		System.out.println("enter name:"+getName());
		
		
	
			System.out.println("hourly rate: "+hourlyRate);
			System.out.println("hours worked :"+hoursWorked);
			
			
	}

	

	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
	

}
