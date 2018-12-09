package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGestureRock {

    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testRockVsRock() {
        assertEquals(evaluator.getWinningGesture(Gesture.ROCK, Gesture.ROCK), 0);
    }

    @Test
    public void testRockVsScissors() {
        assertEquals(evaluator.getWinningGesture(Gesture.ROCK, Gesture.SCISSORS), 1);
    }

    @Test
    public void testRockVsPaper() {
        assertEquals(evaluator.getWinningGesture(Gesture.ROCK, Gesture.PAPER), 2);
    }
}
