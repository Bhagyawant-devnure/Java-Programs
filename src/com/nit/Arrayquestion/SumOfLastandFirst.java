package com.nit.Arrayquestion;
import java.util.Scanner;

public class SumOfLastandFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter element for "+i+"index position");
			arr[i]=sc.nextInt();
			
		}
		int sum=arr[0]+arr.length-1+arr[0];
		
		System.out.println("total is"+sum);
	}

}
