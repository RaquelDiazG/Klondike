package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    private static final int NUM_CARDS = 52;

    public Deck() {
        this.cards = new ArrayList<Card>();
        Suit[] suits = Suit.values();
        CardValue[] values = CardValue.values();
        for (CardValue cardValue : values) {
            for (Suit suit : suits) {
                Card card = new Card(cardValue, suit);
                this.cards.add(card);
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card getCard() {
        int random = new Random().nextInt(cards.size() - 1);
        Card card = cards.get(random);
        cards.remove(random);
        return card;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "[X,X]";
    }

}
