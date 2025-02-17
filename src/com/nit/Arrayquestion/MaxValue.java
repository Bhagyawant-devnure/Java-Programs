//Write a program to find maximum element in array

package com.nit.Arrayquestion;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxValue {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		OptionalInt max = Arrays.stream(a).max();
		max.ifPresent(System.out::println);

	}

}
