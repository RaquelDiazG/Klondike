package es.upm.miw.iwvg.klondike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PileTest {

    private List<Card> cardsFaceUp;

    private List<Card> cardsFaceDown;

    private Pile pile;

    @Before
    public void initialize() {
        pile = new Pile();
        cardsFaceUp = new ArrayList<Card>();
        cardsFaceUp.add(new Card(CardValue.AS, Suit.O));
        cardsFaceUp.add(new Card(CardValue.DOS, Suit.C));
        cardsFaceUp.add(new Card(CardValue.TRES, Suit.E));
        cardsFaceUp.add(new Card(CardValue.CUATRO, Suit.B));
        cardsFaceDown = new ArrayList<Card>();
        cardsFaceDown.add(new Card(CardValue.K, Suit.O));
        cardsFaceDown.add(new Card(CardValue.Q, Suit.C));
        cardsFaceDown.add(new Card(CardValue.J, Suit.E));
        pile.setCardsFaceUp(cardsFaceUp);
        pile.setCardsFaceDown(cardsFaceDown);
    }

    @Test
    public void isEmptyTest() {
        assertFalse(pile.isEmpty());
        cardsFaceUp = new ArrayList<Card>();
        cardsFaceDown = new ArrayList<Card>();
        pile.setCardsFaceDown(cardsFaceDown);
        pile.setCardsFaceUp(cardsFaceUp);
        assertTrue(pile.isEmpty());
    }

    @Test
    public void getLastCardFaceUpTest() {
        assertEquals(new Card(CardValue.CUATRO, Suit.B).toString(), pile.getLastCardFaceUp().toString());
    }

    @Test
    public void getLastCardFaceDownTest() {
        assertEquals(new Card(CardValue.J, Suit.E).toString(), pile.getLastCardFaceDown().toString());
    }

    @Test
    public void removeLastCardFaceUpTest() {
        assertEquals(4, pile.getCardsFaceUp().size());
        pile.removeLastCardFaceUp();
        assertEquals(3, pile.getCardsFaceUp().size());
    }

    @Test
    public void removeLastCardFaceDownTest() {
        assertEquals(3, pile.getCardsFaceDown().size());
        pile.removeLastCardFaceDown();
        assertEquals(2, pile.getCardsFaceDown().size());
    }

    @Test
    public void addCardFaceUpTest() {
        assertEquals(4, pile.getCardsFaceUp().size());
        pile.addCardFaceUp(new Card(CardValue.CINCO, Suit.O));
        assertEquals(5, pile.getCardsFaceUp().size());
    }

    @Test
    public void getAllCardsTest() {
        assertEquals(7, pile.getAllCards().size());
        pile.removeLastCardFaceDown();
        assertEquals(6, pile.getAllCards().size());
        pile.removeLastCardFaceUp();
        assertEquals(5, pile.getAllCards().size());
    }

    @Test
    public void getCardsFaceUpTest() {
        assertEquals(4, pile.getCardsFaceUp().size());
        pile.removeLastCardFaceUp();
        assertEquals(3, pile.getCardsFaceUp().size());
        pile.removeLastCardFaceUp();
        assertEquals(2, pile.getCardsFaceUp().size());
    }

    @Test
    public void getCardsFaceDownTest() {
        assertEquals(3, pile.getCardsFaceDown().size());
        pile.removeLastCardFaceDown();
        assertEquals(2, pile.getCardsFaceDown().size());
        pile.removeLastCardFaceDown();
        assertEquals(1, pile.getCardsFaceDown().size());
    }

    @Test
    public void flipTest() {
        assertEquals(4, pile.getCardsFaceUp().size());
        assertEquals(3, pile.getCardsFaceDown().size());
        pile.flip();
        assertEquals(5, pile.getCardsFaceUp().size());
        assertEquals(2, pile.getCardsFaceDown().size());
    }

    @Test
    public void setCardsFaceUpTest() {
        assertEquals(4, pile.getCardsFaceUp().size());
        List<Card> newList = new ArrayList<Card>();
        newList.add(new Card(CardValue.K, Suit.O));
        newList.add(new Card(CardValue.K, Suit.C));
        pile.setCardsFaceUp(newList);
        assertEquals(2, pile.getCardsFaceUp().size());
    }

    @Test
    public void setCardsFaceDownTest() {
        assertEquals(3, pile.getCardsFaceDown().size());
        List<Card> newList = new ArrayList<Card>();
        newList.add(new Card(CardValue.K, Suit.O));
        newList.add(new Card(CardValue.K, Suit.C));
        pile.setCardsFaceDown(newList);
        assertEquals(2, pile.getCardsFaceDown().size());
    }

    @Test
    public void listToStringTest() {
        Card card1 = new Card(CardValue.AS, Suit.O);
        Card card2 = new Card(CardValue.DOS, Suit.C);
        Card card3 = new Card(CardValue.TRES, Suit.E);
        Card card4 = new Card(CardValue.CUATRO, Suit.B);

        // Card card5 = new Card(CardValue.K, Suit.O);
        // Card card6 = new Card(CardValue.Q, Suit.C);
        // Card card7 = new Card(CardValue.J, Suit.E);

        String stringFaceUp = card1.toString() + card2.toString() + card3.toString() + card4.toString();
        String stringFaceDown = "[[[";
        assertEquals(stringFaceDown + stringFaceUp, pile.toString());

        pile.setCardsFaceUp(new ArrayList<Card>());
        stringFaceUp = "";
        stringFaceDown = "[[[";
        assertEquals(stringFaceDown + stringFaceUp, pile.toString());

        pile.setCardsFaceDown(new ArrayList<Card>());
        assertEquals("<vacío>", pile.toString());
    }
}
