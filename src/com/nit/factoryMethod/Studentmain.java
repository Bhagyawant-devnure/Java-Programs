package com.nit.factoryMethod;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many student");
		int noOfObj = sc.nextInt();
		for(int i=1;i<=noOfObj;i++) {
			Student object=Student.getStudentobj();
			System.out.println(object);
			
		}
		sc.close();
		

	}

}
