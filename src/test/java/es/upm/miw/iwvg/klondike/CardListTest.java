package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CardListTest {

    private CardList cards;

    @Before
    public void initialize() {
        cards = new CardList();
        cards.addCard(new Card(CardValue.AS, Suit.O));
        cards.addCard(new Card(CardValue.DOS, Suit.C));
        cards.addCard(new Card(CardValue.TRES, Suit.E));
        cards.addCard(new Card(CardValue.CUATRO, Suit.B));
    }

    @Test
    public void isEmptyTest() {
        assertFalse(cards.isEmpty());
        assertEquals(4, cards.getCards().size());
        cards.removeAll();
        assertTrue(cards.isEmpty());
    }

    @Test
    public void getRandomCardTest() {
        assertNotNull(cards.getRandomCard());
    }

    @Test
    public void getLastCardTest() {
        assertEquals(new Card(CardValue.CUATRO, Suit.B).toString(), cards.getLastCard().toString());
    }

    @Test
    public void removeLastCardTest() {
        assertEquals(4, cards.getCards().size());
        cards.removeLastCard();
        assertEquals(3, cards.getCards().size());
    }

    @Test
    public void addCardTest() {
        assertEquals(4, cards.getCards().size());
        cards.addCard(new Card(CardValue.CINCO, Suit.O));
        assertEquals(5, cards.getCards().size());
    }

    @Test
    public void removeAllTest() {
        assertFalse(cards.isEmpty());
        cards.removeAll();
        assertTrue(cards.isEmpty());
    }

    @Test
    public void getCardsTest() {
        assertEquals(4, cards.getCards().size());
    }

    @Test
    public void setCardsTest() {
        assertEquals(4, cards.getCards().size());
        List<Card> newList = new ArrayList<Card>();
        newList.add(new Card(CardValue.K, Suit.O));
        newList.add(new Card(CardValue.K, Suit.C));
        cards.setCards(newList);
        assertEquals(2, cards.getCards().size());
    }

    @Test
    public void listToStringTest() {
        Card card1 = new Card(CardValue.AS, Suit.O);
        Card card2 = new Card(CardValue.DOS, Suit.C);
        Card card3 = new Card(CardValue.TRES, Suit.E);
        Card card4 = new Card(CardValue.CUATRO, Suit.B);
        assertEquals(card1.toString() + card2.toString() + card3.toString() + card4.toString(), cards.listToString(cards.getCards()));
    }
}
