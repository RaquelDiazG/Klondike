package es.upm.miw.iwvg.klondike;

public class Foundation extends CardList {

    private Suit suit;

    public Foundation(Suit suit) {
        super();
        this.suit = suit;
    }

    @Override
    public String toString() {
        if (super.cards.isEmpty()) {
            return "<vacío>";
        }
        return super.cards.get(super.cards.size() - 1).toString();
    }

}
