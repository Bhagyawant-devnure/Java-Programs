package com.nit.Exception_Assignment_6;

public class BankAccount implements Bank{
	private long accountNumber;
	private double balance;
	
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public void deposite(double amount) throws InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException("Amount can not be zero or negative");
		}
		this.balance +=amount;
	}
	public void withdraw(double amount) throws InvalidAmountException ,InsufficientFundsException {
	
	if(amount<0) {
		throw new InvalidAmountException("Amount can not be less than zero");
		
		}
	else if(amount>balance) {
		throw new InsufficientFundsException("invalid amount");
	}
	
		
	
	balance -=amount;
	System.out.println("withdraw amount withdrawal susscesfully");
	
	}
	@Override
	public void transfer(double amount) throws AccountNotFoundException, InvalidAmountException {
		// TODO Auto-generated method stub
		
	}
	
	
	public void transfer(BankAccount toAccount, double amount) 
			throws InsufficientFundsException,  AccountNotFoundException, InvalidAmountException  
	{
		
			if(amount<0) {
				throw new InvalidAmountException("Invalid Amount");}
			else  if(amount>balance) {
				throw new InsufficientFundsException("");}
			else if(toAccount == null) {
				throw new AccountNotFoundException("Ac not F");
				}
		
		this.withdraw(amount);
		 toAccount.deposite(amount);
	        System.out.println("Transfer successful. Transferred amount: " + amount);
			

		}
		
	
	@Override
	public void applyForLoan(double amount)throws LoanNotAllowedException, InvalidAmountException
	{
	
		 if (amount <= 0) {
	            throw new InvalidAmountException("Loan amount must be greater than zero.");
	        }
	        if (amount > 50000) {
	            throw new LoanNotAllowedException("Loan amount is limit of 50000.");
	        }
	        if (balance < 50000) {
	            throw new LoanNotAllowedException("Insufficient account balance for loan approval.");
	        }
	        balance += amount;
	        System.out.println("Loan approved. Current balance: " + balance);

	
	}
	@Override
	public double getBalance() {
		
		return this.balance;
	}
	
		
	
	
	
	 

}
