package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void initialize() {
        game = new Game();
    }

    @Test
    public void testPlayer1WinAndGetAPoint() {
        Player player1 = new Player(Gesture.ROCK);
        Player player2 = new Player(Gesture.SCISSORS);

        int player1Score = game.getPlayer1Score();
        int player2Score = game.getPlayer2Score();
        int draw = game.getDraw();

        game.play(player1, player2);
        assertEquals(game.getPlayer1Score(), player1Score + 1);
        assertEquals(game.getPlayer2Score(), player2Score);
        assertEquals(game.getDraw(), draw);
    }
}