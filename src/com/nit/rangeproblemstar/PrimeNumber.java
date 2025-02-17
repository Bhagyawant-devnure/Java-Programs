package com.nit.rangeproblemstar;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]args) {
	int number;
	int prime=0;
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	number = sc.nextInt();
	
	if(number ==0 || number == 1) {
		System.out.println(number + "is not prime number");
	}
	else {
		for(int i = 2; i<=number/2;) {
			if(number % i ==0) {
				System.out.println(number + "is not prime number");
				prime=1;
				break;
			}
		}
		if(prime == 0) {
			System.out.println(number + " is prime number");
		}		
	}
	sc.close();

}


}
