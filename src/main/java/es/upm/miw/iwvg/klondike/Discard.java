package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Discard {

    private ArrayList<Card> cards;

    public Discard() {
        this.cards = new ArrayList<>();
    }

    public void remove() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        if (cards.isEmpty()) {
            return "<vacío>";
        } else {
            return cards.toString();
        }
    }

}
