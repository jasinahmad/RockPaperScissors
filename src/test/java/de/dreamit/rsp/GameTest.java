package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static de.dreamit.rsp.Gesture.*;
import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void initialize() {
        game = new Game();
    }

    @Test
    public void testPlayer1Wins() {
        Player player1 = new Player(ROCK);
        Player player2 = new Player(SCISSORS);

        int player1Score = game.getPlayer1Score();
        int player2Score = game.getPlayer2Score();
        int draw = game.getDraw();

        game.play(player1, player2);

        assertEquals(game.getPlayer1Score(), player1Score + 1);
        assertEquals(game.getPlayer2Score(), player2Score);
        assertEquals(game.getDraw(), draw);
    }

    @Test
    public void testPlayer2Wins() {
        Player player1 = new Player(SCISSORS);
        Player player2 = new Player(ROCK);

        int player1Score = game.getPlayer1Score();
        int player2Score = game.getPlayer2Score();
        int draw = game.getDraw();

        game.play(player1, player2);

        assertEquals(game.getPlayer1Score(), player1Score);
        assertEquals(game.getPlayer2Score(), player2Score+1);
        assertEquals(game.getDraw(), draw);
    }

    @Test
    public void testDraw() {
        Gesture randomGesture = randomGesture();
        Player player1 = new Player(randomGesture);
        Player player2 = new Player(randomGesture);

        int player1Score = game.getPlayer1Score();
        int player2Score = game.getPlayer2Score();
        int draw = game.getDraw();

        game.play(player1, player2);

        assertEquals(game.getPlayer1Score(), player1Score);
        assertEquals(game.getPlayer2Score(), player2Score);
        assertEquals(game.getDraw(), draw+1);
    }

    @Test
    public void testGetResult(){
        testDraw();
        String result = "Player1 Wins: 0\nPlayer2 Wins: 0\nDraw: 1";
        assertEquals(game.getResult(),result);
    }
}
