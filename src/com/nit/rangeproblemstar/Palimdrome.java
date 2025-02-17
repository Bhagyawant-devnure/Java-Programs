package com.nit.rangeproblemstar;

public class Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1211;
		int rev=0;
		int org;
		int lastDigit;
		 
		org=num;
		while(num!=0) {
			lastDigit=num%10;
			rev=rev*10+lastDigit;
			num/=10;
			
			
		}
		if(org==rev) {
			System.out.println("it is palimdrome number");
		}
		else {
			System.out.println("it is not plaimdrome number");
		}
	}

}
