package com.nit.Exception_Test_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConversionDemo {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		
		System.out.println("enter temp in celsius");//prompt user for input
		double celsius = sc.nextDouble();
		
		double fehrenhitfromcelsius=(celsius*9/5)+32;//convert celsius to fahrenheit
		System.out.println("temperature in fahrenheit:"+fehrenhitfromcelsius);
		
		
		System.out.println("enter tem in fahrenheit:");//input tem in fahrenehit
		double fahrenheit =sc.nextDouble();
		
		double celsiusfromFahreneheit=(fahrenheit-32)*5/9;//convert fahrenehit to celsius
		System.out.println("Temperature in Celsius: " + celsiusfromFahreneheit);

    } catch (InputMismatchException e) {
        // Handle invalid input
        System.out.println("\nError: Invalid input! Please enter a valid number.");
        System.out.println("getMessage(): " + e.getMessage());
        System.out.println("\nprintStackTrace():");
        e.printStackTrace();
        System.out.println("\ntoString(): " + e.toString());
    } finally {
        // Close the scanner
        sc.close();
	}
	
	}

}
