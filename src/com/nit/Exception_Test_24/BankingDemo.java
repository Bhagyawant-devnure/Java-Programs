

package com.nit.Exception_Test_24;

import java.util.InputMismatchException;
import java.util.Scanner;




public class BankingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();
        try {
        	if(amount<=0) {
        		throw new InputMismatchException();
        		}
        	
            
            System.out.println("You entered withdrawal amount: " + amount);
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.println("error: " + e.getMessage());
            System.out.println("error: " + e.toString());
            System.out.println("error:");
            e.printStackTrace();
        }
        finally 
        {
            scanner.close();
        }
    }
}



		

	


