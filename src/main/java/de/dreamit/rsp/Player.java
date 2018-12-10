package de.dreamit.rsp;

/**
 * Player class for human and computer player
 */
public class Player {

    private Gesture gesture;

    public Player(Gesture gesture) {
        this.gesture = gesture;
    }

    public Gesture getGesture() {
        return gesture;
    }

    public void setGesture(Gesture gesture) {
        this.gesture = gesture;
    }
}
