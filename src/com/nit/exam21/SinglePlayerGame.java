package com.nit.exam21;

public class SinglePlayerGame {
	 private double soloBonusRate;
	private double baseFee;

	    public SinglePlayerGame(String gameName, double baseFee, double soloBonusRate) {
	        super();
	        this.soloBonusRate = soloBonusRate;
	    }

	    public double calculateFee(int players) {
	        if (players > 1) {
	            System.out.println("Error: Single-player games can only have one player.");
	            return 0;
	        }
	        return baseFee + (baseFee * soloBonusRate / 100);
	    }
}
