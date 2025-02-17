package com.nit.Arry_Logical;

public class SmallestLargest {

	public static void main(String[] args) {
		int []arr= {15,3,7,22,5,9,12};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					System.out.println("smallest element is: "+arr[j]);
				}
				
				}
			}
		}
	}


