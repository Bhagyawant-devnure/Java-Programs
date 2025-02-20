/*Q2) WAP to print all the names from String array which contains 
    letter 'a' in the name.

    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]*/

package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;
import java.util.stream.Stream;

public class StartWithChar {

	public static void main(String[] args) {
		String [] name = {"Rahul","Raj","Arnav","Scott","Smith"};
		
		Stream<String> stream = Arrays.stream(name);//// Converting the array into a Stream
		Object [] array =stream.filter(str -> str.contains("a")).toArray();//// Filtering the stream to select only names that contain the letter 'a'
		System.out.println(Arrays.toString(array));// Printing the filtered names as an array
		/*for(Object obj :array) {
			System.out.println(obj);
		}*/
		
	}

}
