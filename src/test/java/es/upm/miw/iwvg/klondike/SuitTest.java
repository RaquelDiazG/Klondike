package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest {

    @Test
    public void getValueTest() {
        assertEquals("o", Suit.O.getValue());
        assertEquals("c", Suit.C.getValue());
    }

    @Test
    public void positionTest() {
        assertEquals(1, Suit.O.position());
        assertEquals(2, Suit.C.position());
        assertEquals(3, Suit.E.position());
        assertEquals(4, Suit.B.position());
    }

}
