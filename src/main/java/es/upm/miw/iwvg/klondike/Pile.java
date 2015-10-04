package es.upm.miw.iwvg.klondike;

public class Pile {
    private int position;

    private Card[] cardsFaceUp;

    private Card[] cardsFaceDown;

    public int getPosition() {
        return position;
    }

    public Pile(int position, Card[] cardsFaceUp, Card[] cardsFaceDown) {
        super();
        this.position = position;
        this.cardsFaceUp = cardsFaceUp;
        this.cardsFaceDown = cardsFaceDown;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Card[] getCardsFaceUp() {
        return cardsFaceUp;
    }

    public void setCardsFaceUp(Card[] cardsFaceUp) {
        this.cardsFaceUp = cardsFaceUp;
    }

    public Card[] getCardsFaceDown() {
        return cardsFaceDown;
    }

    public void setCardsFaceDown(Card[] cardsFaceDown) {
        this.cardsFaceDown = cardsFaceDown;
    }

    // @Override
    // public String toString() {
    // return "Pile [position=" + position + ", cardsFaceUp=" + Arrays.toString(cardsFaceUp) + ", cardsFaceDown="
    // + Arrays.toString(cardsFaceDown) + "]";
    // }

}
