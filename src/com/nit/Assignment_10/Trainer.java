package com.nit.Assignment_10;

public class Trainer {
int trainerId;
String trainerName;
double basicSalary;
double HRAPer;
double DAPer;
int batchCount;
double perkPerBatch;


public Trainer(int trainerId, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
		double perkPerBatch) {
	super();
	
	this.trainerId = trainerId;
	this.trainerName = trainerName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.batchCount = batchCount;
	this.perkPerBatch = perkPerBatch;
}


public double calculateGrossSalary(){
	return basicSalary + HRAPer + DAPer + (batchCount*perkPerBatch);
}

}
