package com.nit.Assignment_10;

public class Sourcing {
	int sourceId;
	String sourceName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	
	
	public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}



	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer + (((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}


}
