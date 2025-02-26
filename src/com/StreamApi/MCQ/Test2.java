package com.StreamApi.MCQ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		   // Creating an ArrayList of integers
        List<Integer> list = new ArrayList<Integer>();
        
        // Adding elements to the list
        list.add(10);
        list.add(13);
        list.add(16);
        list.add(18);
        
        // Using Java Stream API to filter odd numbers from the list
        List<Integer> list2 = list.stream()
                                  .filter(x -> x % 2 != 0) // Keeping only odd numbers
                                  .collect(Collectors.toList()); // Collecting result into a new list
        
        // Printing the filtered list containing only odd numbers
        System.out.println(list2);

	}

}
