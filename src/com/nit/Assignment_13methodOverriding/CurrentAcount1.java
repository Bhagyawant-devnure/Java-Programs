package com.nit.Assignment_13methodOverriding;

public class CurrentAcount1 extends BankAc {
	protected double overdraftLimit=5000.0;

	public CurrentAcount1(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public void calculateInterest() {
		System.out.println("Current Account do not earn interest");
	}
	
	public void checkOverdraftLimit() {
		System.out.println("overdraftlimit amount"+overdraftLimit);
	}
	

}
