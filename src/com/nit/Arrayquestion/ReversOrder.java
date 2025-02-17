package com.nit.Arrayquestion;

import java.util.Scanner;

public class ReversOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		//Initilize the array element using loop
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter elements for "+i+" index position");
			arr[i]=sc.nextInt();
			
		}
		//printing array in reverse order
		for(int i=arr.length-1;i>=0;i--)
			System.out.println("rever order"+arr[i]);
			
			

	}

}
