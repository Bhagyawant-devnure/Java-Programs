package com.nit.Method_Multithreading_mcq_5;

class Test extends Thread
{
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();
	}	
}

public class MultiThread2 {

	public static void main(String[] args) {
		
			nit();
		}
		
		static public void nit() {
			Test test = new Test();
			test.start();
		}
		

	}


