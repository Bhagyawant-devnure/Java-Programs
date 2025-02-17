package com.nit.Arry_Logical;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) 
	{
		
		int arr[]= {10,99,20,7,100};
		int temp=0;
		
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++)
		{
			if(arr[arr.length-i]< arr[arr.length-1])
			{
				System.out.println("2nd Max is : "+arr[arr.length-i]);
				System.exit(0);
			}
		}
		
	}
		

}
