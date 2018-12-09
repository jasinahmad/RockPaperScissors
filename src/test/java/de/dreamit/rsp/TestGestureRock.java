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

    @Test
    public void testRockVsScissors() {
        Evaluator evaluator = new Evaluator();
        Gesture rock = Gesture.ROCK;
        Gesture scissors = Gesture.SCISSORS;

        assertEquals(evaluator.getWinningGesture(rock, scissors), 1);
    }

    @Test
    public void testRockVsPaper() {
        Evaluator evaluator = new Evaluator();
        Gesture rock = Gesture.ROCK;
        Gesture paper = Gesture.PAPER;

        assertEquals(evaluator.getWinningGesture(rock, paper), 2);
    }
}
