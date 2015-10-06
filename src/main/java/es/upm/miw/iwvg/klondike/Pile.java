package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Pile {

    private int position;

    private ArrayList<Card> cards;

    public Pile(int position, Deck deck) {
        this.cards = new ArrayList<>();
        for (int i = 0; i < position; i++) {
            Card card = deck.getCard();
            this.cards.add(card);
        }
        this.position = position;
    }

    public void remove() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card getLastCard() {
        int lastIndex = cards.size() - 1;
        Card card = cards.get(lastIndex);
        return card;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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
        }
        String stringPile = "";
        for (int i = 0; i < cards.size() - 1; i++) {
            stringPile += "[";
        }
        return stringPile + cards.get(cards.size() - 1).toString();
    }

}
