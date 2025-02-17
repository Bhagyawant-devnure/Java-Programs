package com.nit.reexam27abstract;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your member ship type:");
		 String membershipType = sc.nextLine();

	        Membership membership = MembershipFactory.Factory(membershipType);
	        double discount = membership.getDiscount();

	        System.out.println("You are entitled to a " + discount + "% discount.");

	        sc.close();
	    

	}

}
