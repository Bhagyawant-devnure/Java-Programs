package com.nit.Arry_Logical;

import java.util.Arrays;

public class SortingAccending {

	public static void main(String[] args) {
		
		
		int arr[]= {100,222,3,47,521,64};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			}
		System.out.println(Arrays.toString(arr));
		
		
	}
}


