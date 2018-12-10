package de.dreamit.rsp;

import org.junit.Before;
import org.junit.Test;

import static de.dreamit.rsp.Gesture.*;
import static org.junit.Assert.assertEquals;

public class PaperTest {
    Evaluator evaluator;

    @Before
    public void initialize() {
        evaluator = new Evaluator();
    }

    @Test
    public void testPaperVsPaper() {
        assertEquals(evaluator.getWinningGesture(PAPER, PAPER), 0);
    }

    @Test
    public void testPaperVsRock() {
        assertEquals(evaluator.getWinningGesture(PAPER, ROCK), 1);
    }

    @Test
    public void testPaperVsScissors() {
        assertEquals(evaluator.getWinningGesture(PAPER, SCISSORS), 2);
    }
}

