package com.nit.exam;

public class JobProfile {
	
	String companyName;
	String role;
	double salary;
	String location;
	String placementCell;
	public JobProfile() {
		
	}
	public JobProfile(String companyName,String role,double salary,String location) {
		this.companyName=companyName;
		this.role=role;
		this.salary=salary;
		this.location=location;
	this.placementCell="Nit PalceMentCell";
	}

	@Override
	public String toString() {
		return "JobProfile [companyName=" + companyName + ", role=" + role + ", location=" + location
				+ ", placementCell=" + placementCell + "]";
	}
	
	void displayDetails() {
		System.out.println("enter company name: "+companyName);
		System.out.println("enter rold: "+role);
		System.out.println("enter location: "+location);
		System.out.println("enter placement: "+placementCell);
	}

}
