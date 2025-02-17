/*Ques - 1
--------------
Question:

Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: ishat it tests the given number against the provided predicate and returns the result.

Define a sample integer number (e.g., 13).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

Test Cases:

Test case 1 : Sample Number (13):
13 is even: false
13 is greater than 10: true
13 is prime: true

Test Case 2:

For number1 = 6:
6 is even: true
6 is greater than 10: false
6 is prime: false

Test Case 3:
For number2 = 17:
17 is even: false
17 is greater than 10: true
17 is prime: true*/



package com.nit.Assignment_17;

import java.util.function.Predicate;

public class CalculationLogic {
	
	public static boolean testPredicate(int number,Predicate<Integer>Predicate) {
		return Predicate.test(number);
	}
	
	public static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		 
			
		}

	}


