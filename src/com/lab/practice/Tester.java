/*Write a Java program to convert Array to List.
A BLC class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method 
takes an array of strings as an argument. It should convert the given 
array to a list of Strings and return this list. 
Note that the length of the list must be the same as that of the array. 
Return null for errors a null array or an empty list for an empty 
array.
An ELC Class called Tester with the main method is given to you. Use 
this class to test your solution*/

package com.lab.practice;


import java.util.*;

//BLC Class
class ArrayToList {
 public static List<String> convertToList(String[] inputArray) {
     
     if (inputArray == null) {
         return null;
     }
     
     
     return new ArrayList<>(Arrays.asList(inputArray));
 }
}

//ELC Class
public class Tester {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     
     int n = Integer.parseInt(scanner.nextLine());
     String[] inputArray = new String[n];
     
     
     for (int i = 0; i < n; i++) {
         inputArray[i] = scanner.nextLine();
     }
     
     
     List<String> resultList = ArrayToList.convertToList(inputArray);
     
     
     System.out.println("Converted List: " + resultList);
     
     scanner.close();
 }
}

