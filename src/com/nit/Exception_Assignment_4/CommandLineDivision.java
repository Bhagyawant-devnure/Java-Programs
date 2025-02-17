package com.nit.Exception_Assignment_4;

import java.util.Scanner;

public class CommandLineDivision {

	public static void main(String[] args)  {
		try {
			if(args.length!=2) {
				throw new IllegalArgumentException("Please provide exactly two command line arguments.");
			}
			try {
				int dividend = Integer.parseInt(args[0]);
				int divisor = Integer.parseInt(args[1]);
				int result=dividend/divisor;
				System.out.println("Result ="+result);
			}
			catch(NumberFormatException e){
				System.out.println("please enter valid input");
				
			}
			catch(ArithmeticException e) {
				System.out.println("division by zero is invalid");
			}}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			finally{
				System.out.println("Division operation completed");
			}
		
	}

}
