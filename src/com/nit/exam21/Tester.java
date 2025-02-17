package com.nit.exam21;

public class Tester {
    public static void main(String[] args) {
        
        SinglePlayerGame soloAdventure = new SinglePlayerGame("Solo Adventure", 500, 20);
        MultiplayerGame teamBattle = new MultiplayerGame("Team game", 1000, 5, 15);

       
        TournamentSystem system = new TournamentSystem();

        
        system.registerGame(soloAdventure, 1);

       
        system.registerGame(soloAdventure, 2);

        
        system.registerGame(teamBattle, 4);

        
        system.registerGame(teamBattle, 6);
    }
}
