package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Foundation {

    private Suit suit;

    private ArrayList<Card> cards;

    public Foundation(Suit suit) {
        this.suit = suit;
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

    public void removeLastCard() {
        int lastIndex = cards.size() - 1;
        cards.remove(lastIndex);
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
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
        return cards.get(cards.size() - 1).toString();
    }

}
