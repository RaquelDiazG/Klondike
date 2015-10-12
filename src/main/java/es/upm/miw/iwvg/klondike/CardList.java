package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardList {

    protected List<Card> cards;

    public CardList() {
        this.cards = new ArrayList<>();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card getRandomCard() {
        int random = new Random().nextInt(cards.size() - 1);
        Card card = cards.get(random);
        cards.remove(random);
        return card;
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

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeAll() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String listToString(List<Card> list) {
        String stringList = "";
        for (Card card : list) {
            stringList += card;
        }
        return stringList;
    }

}
