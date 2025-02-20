package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringLength {

	public static void main(String[] args) {
		String [] words = {"Raj","rohit","smirti","richa","sky"};
		
		
		 Stream<String> stream = Arrays.stream(words);
	Arrays.stream(words).filter(word -> word.length()>3).forEach(System.out::println);
		  Object[] array = stream.filter(word -> word.length()>3).toArray();
	       
	        System.out.println(Arrays.toString(array));

	
	}

}
