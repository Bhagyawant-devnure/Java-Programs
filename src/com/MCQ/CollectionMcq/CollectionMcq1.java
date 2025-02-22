package com.MCQ.CollectionMcq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMcq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");

	}

}
//Output-progress nareshIt nareshIt google
