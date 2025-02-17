package com.nit.Assignment_13methodOverriding;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("  Account Menu");
		System.out.println("Select Account type");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("3. Fixed Deposit Account");
		
		System.out.println("\nPlease enter your account choice[1,2,3]");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder name : ");
		String accountHoldername =sc.nextLine();
		
		
		System.out.println("Enter account number : ");
		String accountNumber = sc.nextLine();
		
		
		System.out.println("Enter ammount");
		double balance = sc.nextDouble();
		
		BankAcount bc = new BankAcount(accountHoldername, accountNumber, balance);
		bc.displayDetails();
		BankAcount.IFSC_CODE();
		
		switch(choice){
		case 1: 
		{
			SavingAccount sa = new SavingAccount(4.00);
			sa.calculateInterest();
			break;
		}
			
		case 2:
		{
			CurrentAccount ca= new CurrentAccount(5000.0);
			ca.calculateInterest();
		}
			
		case 3:
			FixedDepositeAcount fd= new FixedDepositeAcount (6.5);
			fd.calculateInterest();
		}
		
		sc.close();
	}

}
