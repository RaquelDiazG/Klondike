package es.upm.miw.iwvg.klondike;

public class Card {

    private CardValue value;

    private Suit suit;

    public Card(CardValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public boolean isNextCardValue(Card card) {
        return (value == card.getCardValue().next());
    }

    public CardValue getCardValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "[" + value.getValue() + "," + suit.getValue() + "]";
    }

}
