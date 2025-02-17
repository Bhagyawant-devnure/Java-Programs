package com.nit.Exception_Assignment_6;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}

}
 class InvalidAmountException extends Exception{
	 public InvalidAmountException (String errorMessage) {
		 super(errorMessage);
	 }
 }
 class AccountNotFoundException extends Exception{
	 public AccountNotFoundException(String errorMessage) {
		 super(errorMessage);
	 }
 } 
 class LoanNotAllowedException extends Exception{
	 public LoanNotAllowedException(String errorMessage) {
		 super(errorMessage);
	 }
 }
 
 