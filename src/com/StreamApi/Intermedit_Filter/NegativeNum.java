package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;

public class NegativeNum {

	public static void main(String[] args) {
		
		Integer [] numbers = {-10,-5,0,5,10,15,-20};
		
		System.out.println("Orignal array"+Arrays.toString(numbers));
		Object[] negativeNums = Arrays.stream(numbers).filter(num -> num>0).toArray();
		System.out.print("Array which contains positive number: ");
		for(Object obj : negativeNums)
		{
			System.out.print(obj +" ");
		}
		
	}

}
