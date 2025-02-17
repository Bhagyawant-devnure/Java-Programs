package com.nit.MultiThreading_Assignment_1;



 class MyThread extends Thread 
 {
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is:"+name);
		for(int i = 0;i<=5;i++) {
			System.out.println("i valus is "+i);
			try {
				Thread.sleep(1000,10000);
				System.out.println(i);
				
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
				
			}
		}
	}

}
public class Thread1
{
	public static void  main (String []args) 
	{
		/*System.out.println("thread "+Thread.currentThread().getName() + "started");*/
		
		MyThread m1 = new MyThread();
		
		m1.start();
		/*try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}*/
		System.out.println("Main thread endead");
	}
}
