package com.nit.Exception_Test_24;

import java.util.Scanner;

public class BookingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TravelRoute1 t1 =new TravelRoute1();
		
		System.out.println("Select option");
		System.out.println("1.Book Tickets");
		System.out.println("2.Check Route Details");
		System.out.println("3.Check Available Seats");
		System.out.println("4.Exit");
		
		System.out.println("Enter your option");
		
		int choice = sc.nextInt();
		sc.nextLine();
		try(sc;) {
		switch(choice)
		{
		case 1:
			System.out.println("Enter your rout :");
			String rout = sc.nextLine();
			
			System.out.println("Total seats :");
			int seats = sc.nextInt();
			
			TravelRoute1 mumTopun = new TravelRoute1(rout, seats);
			mumTopun.bookTicket(seats);
			break;
			
		case 2:
			System.out.println();
			
		}
		

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		}

}
