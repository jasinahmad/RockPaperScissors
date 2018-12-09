package de.dreamit.rsp;

/**
 * Evaluator who knows which gesture wins in a battle
 */
public class Evaluator {

    public int getWinningGesture(Gesture gesture1, Gesture gesture2) {

        if (gesture1 == gesture2) {
            return 0;
        }

        switch (gesture1) {
            case ROCK:
                if (gesture2 == Gesture.SCISSORS) {
                    return 1;
                } else if (gesture2 == Gesture.PAPER) {
                    return 2;
                }
            case SCISSORS:
                if (gesture2 == Gesture.PAPER) {
                    return 1;
                } else if (gesture2 == Gesture.ROCK) {
                    return 2;
                }
            case PAPER:
                if (gesture2 == Gesture.ROCK) {
                    return 1;
                } else if (gesture2 == Gesture.SCISSORS) {
                    return 2;
                }
            default:
                return 0;
        }
    }
}
