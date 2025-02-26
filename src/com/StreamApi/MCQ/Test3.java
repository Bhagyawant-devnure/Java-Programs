package com.StreamApi.MCQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class Test3 {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> list = new ArrayList<Integer>();

        // Adding elements to the list
        list.add(12);
        list.add(13);
        list.add(16);
        list.add(14);

        // Using Java Stream API to find the maximum element in the list
        Optional<Integer> max = list.stream()
                                    .max((x, y) -> x.compareTo(y)); // Comparing two elements to find the maximum

        // Printing the maximum element wrapped inside Optional
        System.out.println(max); // Output: Optional[16]
        
        // If you want to print the actual value without Optional wrapper:
        max.ifPresent(System.out::println); // Output: 16
    }
}

/*Lambda Expression in max():

(x, y) -> x.compareTo(y) is a comparator to compare two integers.*/
