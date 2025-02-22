package com.MCQ.CollectionMcq;

import java.util.ArrayList;

public class CollectionMcq5 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		for(int i=0;i<10;i++) 
		{
			al.add(i);
		}
		for(int str: al)System.out.print(str+" ");

	}

}//0123456789
