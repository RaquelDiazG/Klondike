package es.upm.miw.iwvg.klondike;

public class Discard extends CardList {

    public Discard() {
        super();
    }

    @Override
    public String toString() {
        if (super.cards.isEmpty()) {
            return "<vacío>";
        } else {
            if (super.cards.size() <= 3) {
                return super.cards.toString();
            } else {
                return super.cards.subList(super.cards.size() - 4, super.cards.size() - 1).toString();

            }
        }
    }

}
