package es.upm.miw.iwvg.klondike;

import java.util.Collections;

public class Deck extends CardList {

    public Deck() {
        super();
        Suit[] suits = Suit.values();
        CardValue[] values = CardValue.values();
        for (CardValue cardValue : values) {
            for (Suit suit : suits) {
                Card card = new Card(cardValue, suit);
                super.cards.add(card);
            }
        }
        Collections.shuffle(super.cards);
    }

    public void end() {
        super.cards = null;
    }

    @Override
    public String toString() {
        if (super.cards.isEmpty()) {
            return "<vacía>";
        } else {
            return "[X,X]";
        }
    }

}
