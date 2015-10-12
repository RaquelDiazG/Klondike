package es.upm.miw.iwvg.klondike;

import java.util.List;

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
                return super.listToString(super.cards);
            } else {
                List<Card> sublist = super.cards.subList(super.cards.size() - 4, super.cards.size() - 1);
                return super.listToString(sublist);
            }
        }
    }

}
