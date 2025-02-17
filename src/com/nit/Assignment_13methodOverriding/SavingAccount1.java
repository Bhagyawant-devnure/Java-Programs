package com.nit.Assignment_13methodOverriding;

public class SavingAccount1 extends BankAc {
	protected double interestRate=4.0;

	public SavingAccount1(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public void calculateInterest() 
	{
		double interest=(balance*interestRate)/100;
		System.out.println("Saving Account Interest"+interest);
		
		
	}
	
	
	

}
