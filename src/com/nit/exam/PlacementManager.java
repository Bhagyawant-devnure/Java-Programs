package com.nit.exam;

import java.util.Scanner;

public class PlacementManager {
	public static JobProfile createJobprofile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String companyName=sc.nextLine();
		
		System.out.println("enter role");
		String role=sc.nextLine();
		
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("location");
		String location=sc.nextLine();
		
		return new JobProfile(companyName ,role, salary, location);
		
	}

}
