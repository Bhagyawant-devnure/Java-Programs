package com.StreamApi.MCQ;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
		System.out.println(list);

	}

}
