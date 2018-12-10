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

    /**
     * Battle between two player and increment the score of the winning player or the draw counter
     *
     * @param player1   Player 1
     * @param player2   Player 2
     */
    public void play(Player player1, Player player2) {
        switch(evaluator.getWinningGesture(player1.getGesture(),player2.getGesture())){
            case 1: player1Score++; break;
            case 2: player2Score++; break;
            default: draw++;
        }
    }

    /**
     * Return the score of the players and draw counter
     */
    public String getResult(){
        return "Player1 Wins: "+ player1Score +"\nPlayer2 Wins: "+ player2Score +"\nDraw: "+draw;
    }


    //Getter for scores and draw counter

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public int getDraw() {
        return draw;
    }
}
