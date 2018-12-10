package de.dreamit.rsp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Enumeration of all possible gestures of the game
 */
public enum Gesture {
    ROCK, SCISSORS, PAPER;

    private static final List<Gesture> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * Returns randomly one of available gestures
     *
     * @return random gesture
     */
    public static Gesture randomGesture() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}