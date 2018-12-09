package de.dreamit.rsp;

/**
 * Evaluator who knows which gesture wins in a battle
 */
public class Evaluator {

    public int getWinningGesture(Gesture gesture1, Gesture gesture2) {
        if (gesture1 == Gesture.ROCK && gesture2 == Gesture.ROCK) {
            return 0;
        }
        return 0;
    }
}
