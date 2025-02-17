package com.nit.Multithreading_assignment_8;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		User user1= new User("raj",15,false);//not eligible
		User user2= new User("raju",35,false);//eligible
		
		Thread thread1=new Thread(()-> {
			try {
				user1.bookDose();
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
				
			}
		});
		
		Thread thread2=new Thread(()-> {
			try {
				user2.bookDose();
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
				
			}
		});
		thread1.start();
		thread2.start();
	

	}
}