package com.nit.Method_Multithreading_mcq_5;

class Test3 extends Thread
{
	int b;
	int a;
	public void run() {
		a++;
	  
		
	}
}

public class MultiThread3 {

	public static void main(String[] args) {

		Test3 test = new Test3();
		test.run();
		System.out.println(test.a);
		System.out.println(test.b);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		

	}

}
