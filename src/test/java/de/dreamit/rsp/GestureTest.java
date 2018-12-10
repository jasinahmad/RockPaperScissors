package de.dreamit.rsp;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GestureTest {

    @Test
    public void testRandomGesture() {
        Gesture randomGesture = Gesture.randomGesture();
        assertTrue(randomGesture instanceof Gesture);
        assertNotNull(randomGesture);
    }
}
