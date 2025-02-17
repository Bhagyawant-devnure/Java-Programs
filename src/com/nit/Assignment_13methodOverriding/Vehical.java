package com.nit.Assignment_13methodOverriding;

public class Vehical {
	protected String name;
    protected int rentalCostPerday;
	protected boolean avalibility;
	
	
	public Vehical(String name, int rentalCostPerday, boolean avalibility) 
	{
		super();
		this.name = name;
		this.rentalCostPerday = rentalCostPerday;
		this.avalibility = avalibility;
	}
	public Vehical() {}

	public void displayDetails() 
	{
		System.out.println("Enter name:"+name);
		System.out.println("enter total day:"+rentalCostPerday);
		System.out.println("avalibility:"+(avalibility ? "avalable": "not avalable"));
		
	}
	
	public double CalculatecostPerDay(int day) 
	{
		return this.rentalCostPerday*day;	
	}
	

}
