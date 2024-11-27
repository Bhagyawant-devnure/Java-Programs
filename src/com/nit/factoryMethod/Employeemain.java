package com.nit.factoryMethod;

import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many employee");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			Employee object =Employee.creatEmployee();
			object.calculateAnnualSalary();
			System.out.println(object);
			
	
		}
sc.close();

	}

}
