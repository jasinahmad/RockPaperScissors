package de.dreamit.rsp;

import static de.dreamit.rsp.Gesture.*;

public class GameRun {

    /**
     * 100 iterations of Rock, Paper, Scissors
     *
     * Player 1 always play randomly
     * Player 2 always choose rock
     *
     * At the end it show how many games each player has won and how many were a draw.
     *
     */
    public static void main(String[] args){
        Game game = new Game();
        Player player1 = new Player(randomGesture());
        Player player2 = new Player(ROCK);

        for(int i = 1;i<=100;i++){
            game.play(player1, player2);
            player2.setGesture(randomGesture());
        }

        System.out.println(game.getResult());
    }
}
