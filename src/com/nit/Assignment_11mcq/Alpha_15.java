package com.nit.Assignment_11mcq;

public class Alpha_15 {
	public final static int MAX_VALUE = 10; 

	static
	{
		System.out.println("Static Block");
	}
}
 class Test15
{
    public static void main(String[] args)
    {
      System.out.println(Alpha_15.MAX_VALUE);
    }
}

