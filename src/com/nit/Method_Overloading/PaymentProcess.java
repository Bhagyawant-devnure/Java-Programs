package com.nit.Method_Overloading;

import java.util.Scanner;

public class PaymentProcess {

	public static void main(String[] args) {
		System.out.println("Payment Menu");
		System.out.println("Please select one Payment Method from the menu");
		System.out.println("\t\t 1)Payment by using Cash");
		System.out.println("\t\t 2)Payment by using Credit Card");
		System.out.println("\t\t 3)Payment by using Debit-Card");
		
		Payment pay = new Payment();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your payment choice[1,2,3]");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Enter the amount you want to pay through cash: ");
		double amount = sc.nextDouble();
			pay.makePayment(amount);
			break;
			
		case 2: System.out.println("Enter your name");
		String name= sc.nextLine();
		name= sc.nextLine();
		System.out.println("enter your 16 digit number");
		String creditCard=sc.nextLine();
		System.out.println("enter payment amount");
		amount=sc.nextDouble();
			
			pay.makePayment(name,creditCard,amount);
			break;
			
		case 3:
			System.out.println("enter your 16 degit debit number");
			String debitcard=sc.nextLine();
			debitcard=sc.nextLine();
			System.out.println("Enter your payment amount:");
			amount=sc.nextDouble();
			pay.makePayment(debitcard,amount);
			break;
		}
		sc.close();
	}

}
