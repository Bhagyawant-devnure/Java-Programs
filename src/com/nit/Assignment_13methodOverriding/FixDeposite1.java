package com.nit.Assignment_13methodOverriding;

public class FixDeposite1 extends BankAc{
	protected double interestRate=6.5;

	public FixDeposite1(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public void calculateInterest() 
	{
		double interest=(balance*interestRate)/100;
		System.out.println("FixDeposite Account Interest"+interest);
		
		
	}

	
	

}
