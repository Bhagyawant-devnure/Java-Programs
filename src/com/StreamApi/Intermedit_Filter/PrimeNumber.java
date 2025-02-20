/*Q3) WAP to print all the Prime Numbers from an Integer Array.

    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    Output : Prime Numbers: [2, 3, 5, 7, 11]
*/

package com.StreamApi.Intermedit_Filter;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		/*int [] numbers = {2,3,4,5,6,7,8,9,10,11};
		
		int[] primeNumber =Arrays.stream(numbers).filter(PrimeNumber::isPrime).toArray();
	System.out.println("Prime number :" + Arrays.toString(primeNumber));*/

	Integer[] nums = {2,3,4,5,6,7,8,9,10,11};
	Arrays.stream(nums).filter(PrimeNumber::isPrime).forEach(System.out::println);

	}
public static boolean isPrime(int num) {
	if(num<2) {
		return false;}
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			return false;
		}
		
	}
	return true;
}
}



