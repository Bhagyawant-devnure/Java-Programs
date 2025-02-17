package com.Array.MethodReferance;

import java.util.Vector;

public class StaticMethodReference {
	
	class EvenOdd{
		public static void isEven(int number) {
			if(number%2==0) {
				System.out.println(number + "is even");
			}
			else {
				System.out.println(number+"is odd");
			}
		}
	}

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(9);
		numbers.add(12);
		//by using lambda expression
		numbers.forEach(num -> EvenOdd.isEven(num));
		
		System.out.println("--------------");
		//by using method referance
		numbers.forEach(EvenOdd::isEven);
	}

}
