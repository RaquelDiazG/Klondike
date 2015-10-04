package es.upm.miw.iwvg.klondike;

public class Card {

    private int number;

    private Suit suit;

    public Card(int number, Suit suit) {
        super();
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[" + number + ", " + suit + "]";
    }

}
