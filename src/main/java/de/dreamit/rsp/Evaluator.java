package de.dreamit.rsp;

import static de.dreamit.rsp.Gesture.*;

/**
 * Evaluator who knows which gesture wins in a battle
 */
public class Evaluator {

    /**
     * Get result of a battle of two gestures
     *
     * @param gesture1
     * @param gesture2
     * @return 1 if gesture1 wins
     * 2 if gesture2 wins
     * 0 if gesture1 == gesture2
     */
    public int getWinningGesture(Gesture gesture1, Gesture gesture2) {

        if (gesture1 == gesture2) {
            return 0;
        }

        switch (gesture1) {
            case ROCK: return (gesture2 == SCISSORS ? 1 : 2);
            case SCISSORS:
                return (gesture2 == PAPER ? 1 : 2);
            case PAPER:
                return (gesture2 == ROCK ? 1 : 2);
            default:
                return 0;
        }
    }
}
