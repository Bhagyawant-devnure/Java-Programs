/*Que 3 : 
========

Gaming Tournament System
Problem Statement:
You are tasked with designing a Java-based Gaming Tournament System for an online gaming platform. 
Players can participate in either Single-Player Games or Multiplayer Games. 
The system should calculate the tournament fees dynamically, allow flexible team sizes..

Requirements:
Game Class (Base Class)
------------------------
Represents a general game with the following attributes:
String gameName: The name of the game.
double baseFee: The base tournament fee for participating.
Methods:
double calculateFee(int players): Calculates the fee by multiplying baseFee with the number of players.
void displayDetails(): Displays general information about the game.


SinglePlayerGame Class (Subclass of Game)
-------------------------------------------
Additional Attributes:
double soloBonusRate: Bonus fee for single-player skill-based games (e.g., 20%).
Overridden Methods:
calculateFee(int players): Adds the solo bonus fee to the base fee (only one player allowed).
displayDetails(): Displays details about the single-player game, including the bonus rate.


MultiplayerGame Class (Subclass of Game)
-----------------------------------------
Represents games where teams compete against each other.

Additional Attributes:
int maxPlayers: Maximum number of players allowed in the game.
double teamDiscountRate: Discount on the fee for team participation (e.g., 15%).

Overridden Methods:
calculateFee(int players): Applies the team discount if the number of players is greater than 1.

displayDetails(): Displays details about the multiplayer game, including the maximum players and team discount.


TournamentSystem Class
----------------------
Contains overloaded methods for registering players in tournaments:
Use overloaded registerGame methods to handle different game types while printing the total fee and any bonuses or discounts.
registerGame(SinglePlayerGame game, int players)
registerGame(MultiplayerGame game, int players)


Tester class
-------------
in main instantiate all classes and perform the registerGame operation and display all the details.


SAMPLE INPUT :
===============
The user inputs the following details:

Single-Player Game

Game Type: Single-Player
Game Name: "Solo Adventure"
Base Fee: ₹500
Solo Bonus Rate: 20%
Number of Players: 1 (Single-player)
Single-Player Game

Game Type: Single-Player
Game Name: "Solo Adventure"
Base Fee: ₹500
Solo Bonus Rate: 20%
Number of Players: 2 (Two players)
Multiplayer Game

Game Type: Multiplayer
Game Name: "Team Battle Royale"
Base Fee: ₹300
Max Players: 5
Team Discount Rate: 15%
Number of Players: 3 (Team of 3 players)
Multiplayer Game

Game Type: Multiplayer
Game Name: "Team Battle Royale"
Base Fee: ₹300
Max Players: 5
Team Discount Rate: 15%
Number of Players: 6 (Team of 6 players)


SAMPLE OUTPUT :
===============

Registering for Single-Player Game: Solo Adventure
Game Name: Solo Adventure
Base Fee: ₹500.0
Solo Bonus Rate: 20.0%
Total Fee for 1 player(s): ₹600.0

Registering for Single-Player Game: Solo Adventure
Game Name: Solo Adventure
Base Fee: ₹500.0
Solo Bonus Rate: 20.0%
Total Fee for 2 player(s): ₹1000.0

Registering for Multiplayer Game: Team Battle Royale
Game Name: Team Battle Royale
Base Fee: ₹300.0
Max Players: 5
Team Discount Rate: 15.0%
Total Fee for 3 player(s): ₹765.0

Registering for Multiplayer Game: Team Battle Royale
Game Name: Team Battle Royale
Base Fee: ₹300.0
Max Players: 5
Team Discount Rate: 15.0%
Total Fee for 6 player(s): ₹1800.0*/

package com.nit.exam21;

public class Game {
	 protected String gameName;
	    protected double baseFee;

	    public Game(String gameName, double baseFee) {
	        this.gameName = gameName;
	        this.baseFee = baseFee;
	    }

	    public double calculateFee(int players) {
	        return baseFee * players;
	    }

	    public void displayDetails() {
	        System.out.println("Game Name:" + gameName);
	        System.out.println("Base Fee: " + baseFee);
	    }
		

}
