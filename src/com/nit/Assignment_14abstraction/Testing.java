package com.nit.Assignment_14abstraction;

import java.util.Scanner;

public class Testing {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1.egg,2.bread");
		int choice= sc.nextInt();
		switch(choice){
			case 1:
				Egg e=new Egg(10, 10, 10, 10, 10,"non-vegitarian"); 
			e.getMacroNutrients();
			break;
			
			case 2: 
				Bread b = new Bread(10, 10, 10, 10, 10,"vegitarian");
			b.getMacroNutrients();
			break;
				
		default: System.out.println("Invalid choice!");		
		}
	
	
	}
	

}


