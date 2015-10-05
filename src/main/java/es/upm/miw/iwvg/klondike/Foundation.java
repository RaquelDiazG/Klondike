package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Foundation {

    private Suit suit;

    private ArrayList<Card> cards;

    public Foundation(Suit suit) {
        this.suit = suit;
        this.cards = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (cards.isEmpty()) {
            return "<vacío>";
        }
        return cards.get(cards.size() - 1).toString();
    }

}
