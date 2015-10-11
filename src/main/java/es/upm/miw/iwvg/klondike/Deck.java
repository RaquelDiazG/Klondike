package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        Suit[] suits = Suit.values();
        CardValue[] values = CardValue.values();
        for (CardValue cardValue : values) {
            for (Suit suit : suits) {
                Card card = new Card(cardValue, suit);
                cards.add(card);
            }
        }
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void end() {
        cards = null;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card getRandomCard() {
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
        if (cards.isEmpty()) {
            return "<vacía>";
        } else {
            return "[X,X]";
        }
    }

}
