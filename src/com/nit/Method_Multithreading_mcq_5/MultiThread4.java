package com.nit.Method_Multithreading_mcq_5;

public class MultiThread4 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		MultiThread4 nit = new MultiThread4();
		for(int i=0;i<10;i++)
		{
			nit.start();//Exception in thread "main" 20
						//java.lang.IllegalThreadStateException
		}
		

	}

}
