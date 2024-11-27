package com.nit.Copy_constructor;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employee");
		int noOf =sc.nextInt();
		for(int i=0;i<noOf;i++) {
			Employee object = Employee.getEmployeeObject();
			System.out.println(object);
		}
sc.close();
	}

}
