package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiscardTest {

    @Test
    public void toStringTest() {
        Discard discard = new Discard();
        assertEquals("<vacío>", discard.toString());
        Card card1 = new Card(CardValue.AS, Suit.O);
        discard.addCard(card1);
        assertEquals(card1.toString(), discard.toString());
        Card card2 = new Card(CardValue.DOS, Suit.C);
        discard.addCard(card2);
        assertEquals(card1.toString() + card2.toString(), discard.toString());
        Card card3 = new Card(CardValue.TRES, Suit.E);
        discard.addCard(card3);
        assertEquals(card1.toString() + card2.toString() + card3.toString(), discard.toString());
    }
}
