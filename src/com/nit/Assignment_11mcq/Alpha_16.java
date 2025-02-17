package com.nit.Assignment_11mcq;

public class Alpha_16 {
	public final static int MAX_VALUE = m1(); 

	static
	{
		System.out.println("Static Block");
	}

	public static int m1()
	{
		return 100;
	}
}
class Test16
{
    public static void main(String[] args)
    {
      System.out.println(Alpha_16.MAX_VALUE);
    }


}
