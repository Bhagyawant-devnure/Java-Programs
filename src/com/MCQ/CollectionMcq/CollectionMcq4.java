package com.MCQ.CollectionMcq;

import java.util.ArrayList;

public class CollectionMcq4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		al.remove(4);//ERROR: Index 4 does NOT exist!
		for(String str: al)
			System.out.print(str+" ");
	}

}//ArrayIndexOutofBoundException
