package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FoundationTest {

    @Test
    public void toStringTest() {
        Foundation foundation = new Foundation();
        assertEquals("<vacío>", foundation.toString());
        foundation.addCard(new Card(CardValue.AS, Suit.O));
        foundation.addCard(new Card(CardValue.DOS, Suit.C));
        foundation.addCard(new Card(CardValue.TRES, Suit.E));
        Card lastCard = new Card(CardValue.CUATRO, Suit.B);
        foundation.addCard(lastCard);
        assertEquals(lastCard.toString(), foundation.toString());
    }
}
