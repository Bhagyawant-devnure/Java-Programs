package com.StreamApi.MCQ;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> al = new ArrayList<String>();

        // Adding elements to the ArrayList
        al.add("A");
        al.add("BC");
        al.add("CDE");
        al.add("DEFG");

        // Using Stream API to filter elements based on length
        List<String> list = al.stream()
                              .filter(x -> x.length() >= 2) // Keeping only strings with length 2 or more
                              .peek(x -> {}) // No operation here, can be used for debugging if needed
                              .toList(); // Collecting the filtered elements into a new list

        // Printing the filtered list
        System.out.println(list); // Output: [BC, CDE, DEFG]
    }
}
