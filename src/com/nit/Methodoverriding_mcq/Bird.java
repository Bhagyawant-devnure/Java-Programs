package com.nit.Methodoverriding_mcq;

public class Bird {
	public void fly()
	{
		System.out.println("Genric Bird is flying");
	}
	
	public void roam()
	{
		System.out.println("Generic Bird is roamig");
	}	
	
}
class Parrot extends Bird
{
	
	public int fly(double height)
	{
		System.out.println("Parrot is flying with :"+height+" height");
		return 0;
	}
	
	public void roam()
	{
		System.out.println("Parrot Bird is roamig");
		
	}
}
class MethodOverridingDemo1 {

	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		p.fly(15.6);
		p.roam();
	}

}


