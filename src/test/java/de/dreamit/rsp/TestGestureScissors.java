package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGestureScissors {
    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testScissorsVsScissors() {
        assertEquals(evaluator.getWinningGesture(Gesture.SCISSORS, Gesture.SCISSORS), 0);
    }

    @Test
    public void testScissorsVsSPaper() {
        assertEquals(evaluator.getWinningGesture(Gesture.SCISSORS, Gesture.PAPER), 1);
    }

    @Test
    public void testScissorsVsRock() {
        assertEquals(evaluator.getWinningGesture(Gesture.SCISSORS, Gesture.ROCK), 2);
    }
}
