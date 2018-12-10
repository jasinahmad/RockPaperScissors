package de.dreamit.rsp;

public class Game {

    private Evaluator evaluator;
    private int player1Score;
    private int player2Score;
    private int draw;

    public Game() {
        evaluator = new Evaluator();
        player1Score = 0;
        player2Score = 0;
        draw = 0;
    }

    public void play(Player player1, Player player2) {
        if (evaluator.getWinningGesture(player1.getGesture(), player2.getGesture()) == 1) {
            player1Score++;
        }
    }

    public int getPlayer1Score() {
        return player1Score;
    }
}
