package com.nit.Arrayquestion;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter elements for "+i+" index position");
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
			
				System.out.println("it is even number"+arr[i]);
			}
			else if(arr[i]%2!=0) {
				System.out.println("odd elements are"+arr[i]);
			}
		}

	}}


