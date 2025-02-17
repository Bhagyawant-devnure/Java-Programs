package com.nit.Assignment_14abstraction;

public class Egg extends Food {
	int tastyScore=7;
	String type = "non-vegetarian";
	
	public Egg(double fats,double proteins, double carbs, double tastyScore, int tastyScore2, String type) {
		super(fats,proteins, carbs,7);
	
	}
	@Override
	void getMacroNutrients() {
		System.out.printf("An egg has "+this.proteins+"gms of protein"+this.fats+"gms of fats"+this.carbs+"gms of carbohydrates.");
		
	}
	
	
	
	

}
