package com.nit.Assignment_13methodOverriding;

import java.util.Scanner;

public class BankApplication1 {

	public static void main(String[] args) {
		System.out.println("  Account Menu");
		System.out.println("Select Account type");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("3. Fixed Deposit Account");
		
		System.out.println("\nPlease enter your account choice[1,2,3]");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		
		String accountHolderName="";
		String accountNumber="";
		double balance=0;
		
		switch(choice){
		 
		case 1:
			System.out.println("Enter your Name");
			accountHolderName=sc.nextLine();
			/*accountHolderName=sc.next();*/
			System.out.println("enter account number");
			accountNumber=sc.nextLine();
			/*accountNumber=sc.next();*/
			System.out.println("enter amount");
			balance = sc.nextDouble();
			BankAc b = new SavingAccount1(accountHolderName,accountNumber,balance);
			b.IFSC_CODE();
			b.displayDetails();
			b.calculateInterest();
			break;
			
		case 2:
			System.out.println("Enter your Name");
			accountHolderName=sc.nextLine();
		/*	accountHolderName=sc.next();*/
			System.out.println("enter account number");
			accountNumber=sc.nextLine();
			/*accountNumber=sc.next();*/
			System.out.println("enter amount");
			balance = sc.nextDouble();
			 b = new SavingAccount1(accountHolderName,accountNumber,balance);
			 b.IFSC_CODE();
			b.displayDetails();
			b.calculateInterest();
			CurrentAcount1 ca=new CurrentAcount1(accountHolderName,accountNumber,balance);
			ca.checkOverdraftLimit();
			break;
			
		case 3:
			System.out.println("Enter your Name");
			accountHolderName=sc.nextLine();
			/*accountHolderName=sc.next();*/
			System.out.println("enter account number");
			accountNumber=sc.nextLine();
			/*accountNumber=sc.next();*/
			System.out.println("enter amount");
			balance = sc.nextDouble();
			 b = new SavingAccount1(accountHolderName,accountNumber,balance);
			 b.IFSC_CODE();
			b.displayDetails();
			b.calculateInterest();
			break;
		
			
			}
	}

}
