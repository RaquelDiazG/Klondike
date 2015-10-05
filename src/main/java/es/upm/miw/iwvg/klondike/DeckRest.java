package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class DeckRest {

    private ArrayList<Card> cards;

    public DeckRest(Deck deck) {
        this.cards = deck.getCards();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
