package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;

public class Pile {

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
    }

    public void addCardFaceUp(Card card) {
        this.cardsFaceUp.add(card);
    }

    public Card getLastCardFaceUp() {
        int lastIndex = cardsFaceUp.size() - 1;
        Card card = cardsFaceUp.get(lastIndex);
        return card;
    }

    public void removeLastCardFaceUp() {
        int lastIndex = cardsFaceUp.size() - 1;
        cardsFaceUp.remove(lastIndex);
    }

    public Card getLastCardFaceDown() {
        int lastIndex = cardsFaceDown.size() - 1;
        Card card = cardsFaceDown.get(lastIndex);
        return card;
    }

    public void removeLastCardFaceDown() {
        int lastIndex = cardsFaceDown.size() - 1;
        cardsFaceDown.remove(lastIndex);
    }

    public ArrayList<Card> getCards() {
        ArrayList<Card> allCards = new ArrayList<Card>();
        allCards.addAll(cardsFaceUp);
        allCards.addAll(cardsFaceDown);
        return allCards;
    }

    public void flip() {
        Card card = getLastCardFaceDown();
        addCardFaceUp(card);
        removeLastCardFaceDown();
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
        if (cardsFaceDown.isEmpty() && cardsFaceUp.isEmpty()) {
            return "<vacío>";
        } else {
            String stringPileDown = "";
            for (int i = 0; i < cardsFaceDown.size() - 1; i++) {
                stringPileDown += "[";
            }
            if (cardsFaceUp.isEmpty()) {
                return stringPileDown + "]";
            } else {
                return stringPileDown + cardsFaceUp.toString();
            }
        }
    }

}
