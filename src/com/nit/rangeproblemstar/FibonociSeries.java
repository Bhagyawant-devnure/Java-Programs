package com.nit.rangeproblemstar;

public class FibonociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =8;
		int first=0;
		int sec=1;
		int nxt;
		for(int i=0;i<num;i++) {
			System.out.println((first)+"");
			nxt=first+sec;
			first=sec;
			sec=nxt;
		}

	}

}
