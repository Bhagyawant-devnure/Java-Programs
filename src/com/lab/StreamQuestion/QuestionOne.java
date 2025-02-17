package com.lab.StreamQuestion;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class QuestionOne {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		IntStream stream1=Arrays.stream(arr);
	   stream1.forEach(System.out::println);
	   
	  System.out.println("---------------------------");
	  
	  double arr1[]= {2.1,3.0,1.0,4.0};	
	  DoubleStream stream2=Arrays.stream(arr1);
	  stream2.forEach(System.out::println);
	   
	  System.out.println("---------------------------");
	  
	  long arr2[]= {2l,3l,1l,4l};	
	  LongStream stream3=Arrays.stream(arr2);
	  stream3.forEach(System.out::println);
	   
	  System.out.println("---------------------------");
	  
	}

}
