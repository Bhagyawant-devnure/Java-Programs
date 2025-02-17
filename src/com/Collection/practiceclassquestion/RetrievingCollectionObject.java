package com.Collection.practiceclassquestion;

import java.util.Enumeration;
import java.util.Vector;

public class RetrievingCollectionObject {

	public static void main(String[] args) {
		Vector <String> listOfCity= new Vector<String>();
		listOfCity.add("Hyderabd");
		listOfCity.add("Pune");
		listOfCity.add("Goa");
		listOfCity.add("Manali");
		
		System.out.println("1)By using tostring method()");
		System.out.println(listOfCity.toString());
		
		System.out.println("-----------------------");
		
		System.out.println("2)By using ordernary for loop");
		for(int i=0;i<listOfCity.size();i++) {
			System.out.println(listOfCity.get(i));
		}
		System.out.println("-----------------------");
		
		System.out.println("3)By using ordernary for each loop");
		for(String city:listOfCity) {
			System.out.println(city);
		}
		System.out.println("--------------------------");
		
		System.out.println("4)By using Enumaration interface");
		Enumeration<String> ele = listOfCity.elements();
		while(ele.hasMoreElements()){
			System.out.println(ele.nextElement());
			
		}
		System.out.println(ele.nextElement());
	}

}
