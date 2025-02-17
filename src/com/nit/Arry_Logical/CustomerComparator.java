package com.nit.Arry_Logical;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class CustomerComparator {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size");
		int size =sc.nextInt();
		Customer[]customer = new Customer[size];
		
		for(int i=0;i<customer.length;i++) 
		{
		
		
		System.out.println("enter customer id");
		int id = sc.nextInt();
		System.out.println("enter customer name");
		String name = sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("enter bill");
		double bill = sc.nextDouble();
		customer[i]=new Customer(id,name,bill);
		
		}
		Arrays.sort(customer,(c1,c2)->c2.id()-c1.id());
		
		

for(Customer customer1:customer) {
	System.out.println(customer1);
	
}

	}

}
