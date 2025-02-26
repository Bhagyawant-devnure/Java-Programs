package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateAndMergeList {

	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size1 =sc.nextInt();
		List<Integer>list1=new ArrayList<>();
		
		for(int i=0;i<size1;i++) {
			list1.add(sc.nextInt());
			
		}
		System.out.println("enter array size");
		int size2 =sc.nextInt();
		List<Integer>list2=new ArrayList<>();
		
		for(int i=0;i<size2;i++) {
			list2.add(sc.nextInt());
			
		}
		
		List<Integer>mergedList=new ArrayList<>(list1);
		for(Integer num :list2) {
			if(!mergedList.contains(num)) {
				mergedList.add(num);
			}
			
		}
		 System.out.println("Merged List (without duplicates): " +mergedList );

	        sc.close();
		
	}

}
