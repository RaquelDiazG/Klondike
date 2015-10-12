package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

    private Card card1;

    private Card card2;

    @Before
    public void initialize() {
        card1 = new Card(CardValue.AS, Suit.O);
        card2 = new Card(CardValue.K, Suit.B);
    }

    @Test
    public void getCardValueTest() {
        assertEquals(CardValue.AS, card1.getCardValue());
        assertEquals(CardValue.K, card2.getCardValue());
    }

    @Test
    public void getSuitTest() {
        assertEquals(Suit.O, card1.getSuit());
        assertEquals(Suit.B, card2.getSuit());
    }

    @Test
    public void toStringTest() {
        assertEquals("[A,o]", card1.toString());
        assertEquals("[K,b]", card2.toString());
    }
}
