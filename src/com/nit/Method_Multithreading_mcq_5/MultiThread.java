package com.nit.Method_Multithreading_mcq_5;

public class MultiThread implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new MultiThread());
		thread.start();
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}
	@Override
	public void run() {
		System.out.println("NareshIT");
	}
	}


