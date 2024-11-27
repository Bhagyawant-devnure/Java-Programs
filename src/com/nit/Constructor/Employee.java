package com.nit.Constructor;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int NoOfProject;
	
	public Employee(String firstName,String lastName,int employeeId,double salary,int NoOfProject) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.employeeId=employeeId;
	this.salary=salary;
	this.NoOfProject=NoOfProject;
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setNoOfProject(int NoOfProject) {
		this.NoOfProject=NoOfProject;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int getemployeeId() {
		return employeeId;
	}
	public double getsalary() {
		return salary;
	}
	public int getNoOfProject() {
		return NoOfProject;
	}
	
	public void calculateSalary() {
		if(NoOfProject>5 && NoOfProject<=10) {
			salary+=5000;
		}
		else if(NoOfProject>10 && NoOfProject<20) {
			salary+=10000;
		}
		else if(NoOfProject>20){
			salary+=15000;
		}
		
	}
	void display() {
		System.out.println("Enter first name: " +firstName);
		System.out.println("Enter last name: " +lastName);
		System.out.println("Enter id: " +employeeId);
		System.out.println("Enter salary: " +salary);
		System.out.println("Enter project : " +NoOfProject);
	}

}
