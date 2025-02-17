package com.nit.rangeproblemstar;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=370;
		int rem;
		int sum=0;
		int dup;
		dup=num;
		
		while(num!=0) {
		rem=num%10;
		sum+=rem*rem*rem;
		num/=10;
		}
		if(sum==dup) {
			System.out.println("it is armstrong number");
		}
		else {
			System.out.println("it is not armstrong number");
		}
		

	}

}
