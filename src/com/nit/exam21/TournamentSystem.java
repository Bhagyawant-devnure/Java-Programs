package com.nit.exam21;


class TournamentSystem {
   public void registerGame(SinglePlayerGame game, int players) {
       System.out.println("Registering Single Player Game");
       
       double fee = game.calculateFee(players);
       if (fee > 0) {
           System.out.println("Total Fee: " + fee);
       }
       System.out.println();
   }

   public void registerGame(MultiplayerGame game, int players) {
       System.out.println("Registering Multiplayer Game");
       game.displayDetails();
       double fee = game.calculateFee(players);
       if (fee > 0) {
           System.out.println("Total Fee: " + fee);
       }
       System.out.println();
   }
}
