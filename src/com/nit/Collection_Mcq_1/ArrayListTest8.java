package com.nit.Collection_Mcq_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest8 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("orange");
		list.add(0,"banana");
		
		ArrayList<String>arlist = new ArrayList<>();
		arlist.add("apple");
		list.add("grapes");
		list.addAll(3,arlist);//that position you add apple 3rd position
		System.out.println(list);
		
	}

}
