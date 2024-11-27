package com.nit.exam;

public class BankAppELC {

	public static void main(String[] args){
		        
		        Bank defaultAccount = new Bank();
		        System.out.println("Default Account Details:");
		        defaultAccount.printBalance();

		        
		        Bank nameOnlyAccount = new Bank("raj");
		        System.out.println("Name-Only Account Details:");
		        nameOnlyAccount.printBalance();

		        
		        Bank detailedAccount = new Bank(" Raj", 12345, 500.0);
		        System.out.println("Detailed Account Details:");
		        detailedAccount.printBalance();

		        
		        System.out.println("Testing deposit method:");
		        detailedAccount.deposit(150.0); 
		        

		        
		        System.out.println("Testing withdraw method:");
		        detailedAccount.withdraw(100.0); 
		        detailedAccount.withdraw(700.0); 
		        

		       
		        System.out.println("Final Balance Details:");
		        detailedAccount.printBalance();
		    }
		

















	}


