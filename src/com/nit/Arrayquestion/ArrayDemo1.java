package com.nit.Arrayquestion;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt(); 
		
		int arr[]= new int[size];
		
		for(int i=0; i<size;i++) {
			
			System.out.println("Enter elements for "+i+" index position");
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("enter serching element");
		int search = sc.nextInt();
		
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				c++;
			}
		}
		
		if(c>0)
		{
			System.out.println("Element found at index"+arr[c]);
		}
		
		else 
			System.out.println(" element Not Found");

	}

}
