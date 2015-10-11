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

    public Card getLastCard() {
        int lastIndex = cards.size() - 1;
        Card card = cards.get(lastIndex);
        return card;
    }

    public void removeLastCard() {
        int lastIndex = cards.size() - 1;
        cards.remove(lastIndex);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        if (cards.isEmpty()) {
            return "<vacío>";
        } else {
            if (cards.size() <= 3) {
                return cards.toString();
            } else {
                System.out.println(cards.size());
                return cards.subList(cards.size() - 4, cards.size() - 1).toString();

            }
        }
    }

}
