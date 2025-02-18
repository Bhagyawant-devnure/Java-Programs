/*Retrieve all the even number from array using Stream API*/

package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;

public class FilterDemo1 {

	public static void main(String[] args) {
		int [] arr= {10,20,15,30,40,45,50,96};
		System.out.println("Orignal Stream :" +Arrays.toString(arr));

		int [] array = Arrays.stream(arr).filter(num ->num%2==0).toArray();
		System.out.println("Array which contains even number: "+Arrays.toString(array));
	}

}
