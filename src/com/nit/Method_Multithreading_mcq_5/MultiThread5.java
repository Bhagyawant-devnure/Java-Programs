package com.nit.Method_Multithreading_mcq_5;

public class MultiThread5 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			MultiThread5 nit = new MultiThread5();
			nit.start();
		}
	}
}
