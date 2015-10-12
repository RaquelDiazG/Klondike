package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {

    @Test
    public void sizeTest() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void toStringTest() {
        Deck deck = new Deck();
        assertEquals("[X,X]", deck.toString());
        deck.removeAll();
        assertEquals("<vacía>", deck.toString());
    }
}
