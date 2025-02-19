package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterDemo2 {

	public static void main(String[] args) {
		  //Retrieve cities which starts with 'H' character
        String []cities = {"Hyderabad", "Jaipur", "Haryana", "Indore", "Chennai"};
       
        Stream<String> stream = Arrays.stream(cities);

        Object[] array = stream.filter(str -> str.startsWith("H")).toArray();
       
        System.out.println(Arrays.toString(array));

	}

}
