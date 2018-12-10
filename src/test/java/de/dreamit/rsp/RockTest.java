package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static de.dreamit.rsp.Gesture.*;
import static org.junit.Assert.assertEquals;

public class RockTest {

    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testRockVsRock() {
        assertEquals(evaluator.getWinningGesture(ROCK, ROCK), 0);
    }

    @Test
    public void testRockVsScissors() {
        assertEquals(evaluator.getWinningGesture(ROCK, SCISSORS), 1);
    }

    @Test
    public void testRockVsPaper() {
        assertEquals(evaluator.getWinningGesture(ROCK, PAPER), 2);
    }
}
