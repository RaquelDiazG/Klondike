package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Pile {

    private int position;

    private ArrayList<Card> cardsFaceDown;

    private ArrayList<Card> cardsFaceUp;

    public Pile(int position, Deck deck) {
        this.cardsFaceDown = new ArrayList<>();
        for (int i = 0; i < position - 1; i++) {
            Card card = deck.getCard();
            this.cardsFaceDown.add(card);
        }
        this.cardsFaceUp = new ArrayList<>();
        Card card = deck.getCard();
        this.cardsFaceUp.add(card);
        this.position = position;
    }

    public void addCardFaceUp(Card card) {
        this.cardsFaceUp.add(card);
    }

    public Card getLastCardFaceUp() {
        int lastIndex = cardsFaceUp.size() - 1;
        Card card = cardsFaceUp.get(lastIndex);
        return card;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ArrayList<Card> getCards() {
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(cardsFaceUp);
        allCards.addAll(cardsFaceDown);
        return allCards;
    }

    public ArrayList<Card> getCardsFaceUp() {
        return cardsFaceUp;
    }

    public ArrayList<Card> getCardsFaceDown() {
        return cardsFaceDown;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cardsFaceDown = cards;
    }

    @Override
    public String toString() {
        if (cardsFaceDown.isEmpty() || cardsFaceUp.isEmpty()) {
            return "<vacío>";
        }

        String stringPileDown = "";
        for (int i = 0; i < cardsFaceDown.size() - 1; i++) {
            stringPileDown += "[";
        }
        return stringPileDown + cardsFaceUp.toString();
    }

}
