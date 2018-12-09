package de.dreamit.rsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGestureRock {

    @Test
    public void testRockVsRock() {
        Evaluator evaluator = new Evaluator();
        Gesture rock1 = Gesture.ROCK;
        Gesture rock2 = Gesture.ROCK;

        assertEquals(evaluator.getWinningGesture(rock1, rock2), 0);
    }
}
