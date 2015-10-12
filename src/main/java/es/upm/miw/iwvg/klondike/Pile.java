package es.upm.miw.iwvg.klondike;

import java.util.ArrayList;
import java.util.List;

public class Pile {

    private List<Card> cardsFaceDown;

    private List<Card> cardsFaceUp;

    public Pile() { // Created to test
        this.cardsFaceDown = new ArrayList<>();
        this.cardsFaceUp = new ArrayList<>();
    }

    public Pile(int position) {
        this.cardsFaceDown = new ArrayList<>();
        for (int i = 0; i < position - 1; i++) {
            Card card = Klondike.getDeck().getRandomCard();
            this.cardsFaceDown.add(card);
        }
        this.cardsFaceUp = new ArrayList<>();
        Card card = Klondike.getDeck().getRandomCard();
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

    public List<Card> getAllCards() {
        List<Card> allCards = new ArrayList<Card>();
        allCards.addAll(cardsFaceUp);
        allCards.addAll(cardsFaceDown);
        return allCards;
    }

    public boolean isEmpty() {
        return this.getAllCards().isEmpty();
    }

    public void flip() {
        Card card = getLastCardFaceDown();
        addCardFaceUp(card);
        removeLastCardFaceDown();
    }

    public List<Card> getCardsFaceUp() {
        return cardsFaceUp;
    }

    public List<Card> getCardsFaceDown() {
        return cardsFaceDown;
    }

    public void setCardsFaceDown(List<Card> cardsFaceDown) {
        this.cardsFaceDown = cardsFaceDown;
    }

    public void setCardsFaceUp(List<Card> cardsFaceUp) {
        this.cardsFaceUp = cardsFaceUp;
    }

    @Override
    public String toString() {
        if (cardsFaceDown.isEmpty() && cardsFaceUp.isEmpty()) {
            return "<vacío>";
        }

        String stringPileDown = "";
        for (int i = 0; i < cardsFaceDown.size(); i++) {
            stringPileDown += "[";
        }
        String stringPileUp = "";
        for (Card cardFaceUp : cardsFaceUp) {
            stringPileDown += cardFaceUp;
        }
        return stringPileDown + stringPileUp;
    }
}
