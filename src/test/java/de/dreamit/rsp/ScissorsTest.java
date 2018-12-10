package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static de.dreamit.rsp.Gesture.*;
import static org.junit.Assert.assertEquals;

public class ScissorsTest {
    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testScissorsVsScissors() {
        assertEquals(evaluator.getWinningGesture(SCISSORS, SCISSORS), 0);
    }

    @Test
    public void testScissorsVsPaper() {
        assertEquals(evaluator.getWinningGesture(SCISSORS, PAPER), 1);
    }

    @Test
    public void testScissorsVsRock() {
        assertEquals(evaluator.getWinningGesture(SCISSORS, ROCK), 2);
    }
}
