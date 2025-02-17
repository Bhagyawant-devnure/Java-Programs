package com.nit.Method_Overloading;

import java.util.Scanner;

public class Payment {
	public void makePayment(double amount) {
		System.out.println("Processing payment via Cash...");
		System.out.println("Amount paid Rs:"+amount);
		System.out.println("payment Successful..");
		
		
		}
	public void makePayment(String cardHolderName,
	String creditCardNumber,
	double amount) {
		if(validateCardNumber(creditCardNumber)&& validateAmount(amount)) {
		System.out.println("Processing payment via Credit Card...");
		System.out.println("Card Holder: "+cardHolderName);
		System.out.println("Card Number: "+maskCardNumber(creditCardNumber));
		System.out.println("Amount Paid Rs:"+amount);
		System.out.println("Payment Successsful...");
		
		}}
	public void makePayment(String debitCardNumber,
	 double amount) {
		if(validateCardNumber(debitCardNumber)&& validateAmount(amount)) {
			System.out.println("Processing payment via debit Card...");
			
			System.out.println("Card Number: "+maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid Rs:"+amount);
			System.out.println("Payment Successsful...");
			
			}}
		
	
	private boolean validateAmount(double amount) {
		if(amount<=0) {
			System.err.println("Error:amount must be positive");
			return false;
		}
		return true;
	}
	private boolean validateCardNumber(String cardNumber) {
		if(cardNumber.length()!=16) {
			System.err.println("Error:Invalid card number.it must be 16 digit");
			return false;
			
		}
		return true;
		
	}
	private String maskCardNumber(String cardNumber) {
		
		return "****_****_****_"+cardNumber.substring(12);
		
	}

}

