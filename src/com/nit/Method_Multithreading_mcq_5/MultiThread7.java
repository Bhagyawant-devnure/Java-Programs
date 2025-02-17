package com.nit.Method_Multithreading_mcq_5;

public class MultiThread7 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		MultiThread7 nit = new MultiThread7();
		for(int i=0;i<10;i++)
		{
			nit.run();
		}
	}
}


