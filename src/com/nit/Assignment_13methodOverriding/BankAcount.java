package com.nit.Assignment_13methodOverriding;

public class BankAcount {
protected String accountHolderName;
protected String accountNumber;
protected double balance;

public static final String IFSC_CODE() {
	String IFSC_CODE="SBI12345";
	return IFSC_CODE;
}

public BankAcount() {}

public BankAcount(String accountHolderName, String accountNumber, double balance) {
	super();
	if(accountHolderName==null) {
		System.err.println("Account holder name cannot be empty");
	}
	else if(accountNumber==" ") {
		System.err.println("account number cannot be empty");
	}
	else if(balance<0) {
		System.err.println("balance cannot be negative");
		
	}else {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
}
public void calculateInterest() {
	System.out.println("this bank intrest rate is 2.0%");
}
public void displayDetails() 
{
	System.out.println("Account holder name = "+accountHolderName);
	System.out.println("Account Number = " + accountNumber);
	System.out.println("Total Balance is = " + balance);
	
}
}

class SavingAccount extends BankAcount{

	protected double interestRate;

	public SavingAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() 
	{
		
		System.out.println("Saving Account Interest"+balance*interestRate/100);
		
		
	}
	
}

class CurrentAccount extends BankAcount {
	protected double overdraftLimit;

	public CurrentAccount(double overdraftLimit) 
	{
		super();
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void calculateInterest() {
		System.out.println("Current Account do not earn interest");
	}
	
	public void checkOverdraftLimit() {
		System.out.println("overdraftlimit amount"+overdraftLimit);
	}
}

class FixedDepositeAcount extends BankAcount {
	protected double interestRate=6.5;

	public FixedDepositeAcount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	@Override
	 public void calculateInterest() {
		System.out.println("fix Account Interest"+balance*interestRate/100);
	}
	
}
