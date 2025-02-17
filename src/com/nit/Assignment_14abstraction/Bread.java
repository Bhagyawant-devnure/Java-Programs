package com.nit.Assignment_14abstraction;

public class Bread extends Food{
	int tastyScroe=8;
	String type="vegetarian";
	
	public Bread(double fats, double proteins, double carbs, double tastyScore, int tastyScroe, String type) {
		super(fats, proteins, carbs,8);
		
	}
	void getMacroNutrients() {
		System.out.printf("An slice of bread has "+this.proteins+"gms of protein"+this.fats+"gms of fats"+this.carbs+"gms of carbohydrates.");
		
	}}

   