package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardValueTest {

    @Test
    public void getValueTest() {
        assertEquals("A", CardValue.AS.getValue());
        assertEquals("2", CardValue.DOS.getValue());
    }

    @Test
    public void nextTest() {
        assertEquals(CardValue.DOS, CardValue.AS.next());
        assertEquals(CardValue.CINCO, CardValue.CUATRO.next());
        assertEquals(CardValue.Q, CardValue.J.next());
    }

}
