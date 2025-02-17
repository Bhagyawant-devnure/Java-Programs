package com.nit.Assignment_10;

public class TaxUtil {
	public double calculateTax(Employee e) {
		if(e.calculateGrossSalary()>=5000) {
			return e.calculateGrossSalary()*0.2;
		}
		else {
			return e.calculateGrossSalary()*0.05;
		}
	}
	
	public double calculateTax(Manager m) {
		if(m.calculateGrossSalary()>=5000) {
			return m.calculateGrossSalary()*0.2;
		}
		else {
			return m.calculateGrossSalary()*0.05;
		}
		
	}
	
	public double calculateTax(Trainer t) {
		if(t.calculateGrossSalary()>=5000) {
			return t.calculateGrossSalary()*0.2;
		}
		else {
			return t.calculateGrossSalary()*0.05;
		}

	}
	
	public double calculateTax(Sourcing s) {
		if(s.calculateGrossSalary()>=5000) {
			return s.calculateGrossSalary()*0.2;
		}
		else {
			return s.calculateGrossSalary()*0.05;
		}
		
	}

}
