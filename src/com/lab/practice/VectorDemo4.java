package com.lab.practice;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 
{
	
			

	public static void main(String[] args) 
	{
		long startTime=System.currentTimeMillis();
		ArrayList<Integer> a1=new ArrayList<Integer>();//does not take synchronized method thats whay they are faster than vector 
		
		for(int i=0;i<10000;i++) {
			a1.add(i);
			}
		long endTime=System.currentTimeMillis();
		
		System.out.println("Total Time taken by ArrayList class :"+(endTime - startTime)+" ms)");
		
		startTime = System.currentTimeMillis();
		Vector<Integer> v1 = new Vector<Integer>();//they have synchronized method thats why they are slow in nature
		for(int i=0;i<10000;i++) {
			v1.add(i);
		}
endTime = System.currentTimeMillis();
		
		System.out.println("Total Time taken by Vector class :"+(endTime - startTime)+" ms");

	}

}
