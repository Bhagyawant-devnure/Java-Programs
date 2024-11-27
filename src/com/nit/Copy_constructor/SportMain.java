package com.nit.Copy_constructor;

import java.util.Scanner;

public class SportMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sport name: ");
		String sportName= sc.nextLine();
		
		System.out.println("Enter size of team: ");
		int teamSize = sc.nextInt();
		
		System.out.println("Enter sport Type: ");
		String sportType=sc.nextLine();
		sportType=sc.nextLine();
		
		Sports football = new Sports(sportName,teamSize);
		football.display();
		 /*Sports basketball = new Sports(sportName, teamSize, sportType);
	        basketball.display();*/
		
	sc.close();

	}
	

}
