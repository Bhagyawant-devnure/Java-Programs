package com.nit.Arry_Logical;

import java.util.Arrays;

public class PairsSum {

	public static void main(String[] args) {
		
		int arr[]= {2,7,4,8,3,5,1,6};
		
		int sum=9;
		for(int i=0;i<arr.length;i++) 
		{
			
			for(int j=1;j<arr.length-1;j++) 
			{
				if(arr[i]+arr[j]==sum) 
				{
					System.out.printf("("+arr[i]+","+arr[j]+")");
				}
				
			}
			System.out.println();
			
		}

	}

}
