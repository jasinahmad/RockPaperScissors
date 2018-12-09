package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGesturePaper {
    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testPaperVsPaper() {
        assertEquals(evaluator.getWinningGesture(Gesture.PAPER, Gesture.PAPER), 0);
    }

    @Test
    public void testPaperVsRock() {
        assertEquals(evaluator.getWinningGesture(Gesture.PAPER, Gesture.ROCK), 1);
    }

    @Test
    public void testPaperVsScissors() {
        assertEquals(evaluator.getWinningGesture(Gesture.PAPER, Gesture.SCISSORS), 2);
    }
}

