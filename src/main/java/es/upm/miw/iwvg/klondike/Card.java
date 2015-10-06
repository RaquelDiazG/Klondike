package es.upm.miw.iwvg.klondike;

public class Card {

    private CardValue value;

    private Suit suit;

    public Card(CardValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return value;
    }

    public void setCardValue(CardValue value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[" + value + ", " + suit + "]";
    }

}
