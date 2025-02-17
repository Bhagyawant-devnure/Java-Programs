package com.nit.Assignment_14abstraction;

public abstract class Food {
	double fats;
	 double proteins;
	 double carbs;
	 double tastyScore;
	public Food(double fats,double proteins, double carbs, double tastyScore) {
		super();
		this.fats=fats;
		this.proteins = proteins;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}
	 abstract void getMacroNutrients();

}
