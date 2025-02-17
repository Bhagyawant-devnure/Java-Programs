package com.nit.Arry_Logical;

import java.util.Arrays;

class InsertMiddleelement {
	
	public static int[] insertMiddleElement(int arr[],int element) 
	{
		
		int newArray[]=new int[arr.length+1];
		int middle=arr.length/2;
		
		for(int i=0;i<middle;i++) 
		{
			newArray[i]=arr[i];
			
		}
		newArray[middle]=element;
		
		for(int i=middle;i<arr.length;i++) 
		{
			newArray[i+1]=element;
		}
		return newArray;
		
	}

}

 class MainClassInsert {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		
		System.out.println("orignal array size is"+Arrays.toString(arr));
		int[]result=InsertMiddleelement.insertMiddleElement(arr,4);
		System.out.println("updated array"+Arrays.toString(result));
	}
 }
 
 
