package com.nit.exam21;


class MultiplayerGame extends Game {
 private int maxPlayers;
 private double teamDiscountRate;

 public MultiplayerGame(String gameName, double baseFee, int maxPlayers, double teamDiscountRate) {
     super(gameName, baseFee);
     this.maxPlayers = maxPlayers;
     this.teamDiscountRate = teamDiscountRate;
 }

 public double calculateFee(int players) {
     if (players > maxPlayers) {
         System.out.println("Error: Maximum players allowed is " + maxPlayers);
         return 0;
     }
     double fee = baseFee * players;
     if (players > 1) {
         fee -= fee * teamDiscountRate / 100;
     }
     return fee;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Maximum Players: " + maxPlayers);
     System.out.println("Team Discount Rate: " + teamDiscountRate + "%");
 }}
