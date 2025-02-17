package com.nit.Exception_Assignment_6;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ac1 = new BankAccount(111, 1000);
		BankAccount ac2 = new BankAccount(222,2000);
		
		Customer c1 = new Customer("Bhagyawant", ac1);

		
		System.out.println("Select an option");
		System.out.println("1.Deposite");
		System.out.println("2.withdrawl");
		System.out.println("3.transfer");
		System.out.println("4.applyforLoan");
		System.out.println("5.checkbalance");
		System.out.println("6.exit");
		
		System.out.println("enter your option");
		int option = sc.nextInt();
		
		
		try {
			switch(option) {
			
			
			case 1://Deposit
				System.out.println("enter amount");
				double amount = sc.nextDouble();
				c1.getAccount().deposite(amount);
				System.out.println("deposite successful.new balance:"+ c1.getAccount() .getBalance());
				break;
				
			case 2://withdrawal
				System.out.println("enter amount");
				amount = sc.nextDouble();
				c1.getAccount().withdraw(amount);
				System.out.println("Withdrawal successful.new balance:"+ c1.getAccount().getBalance());
				break;
				
			case 3://Transfer
				System.out.println("enter amount");
				amount = sc.nextDouble();
				c1.getAccount().transfer(amount);
				System.out.println("Transfer successful.new balance:"+ c1.getAccount().getBalance());
				break;
				
			case 4://applyForLoan
				System.out.println("enter amount");
				amount = sc.nextDouble();
				c1.getAccount().applyForLoan(amount);
				System.out.println("applyforLoan successful.new balance:"+ c1.getAccount().getBalance());
				break;
				
			case 5://checkBalance
				c1.getAccount().getBalance();
				System.out.println("checkBalance successful.new balance:"+ c1.getAccount().getBalance());
				break;
				
			case 6://Exit
				sc.close();
				System.out.println("thank you for visit our bank");
				break;
			}
			}
		catch(InvalidAmountException | InsufficientFundsException |AccountNotFoundException|LoanNotAllowedException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
