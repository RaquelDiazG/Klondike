package es.upm.miw.iwvg.klondike;

public class Foundation extends CardList {

    public Foundation() {
        super();
    }

    @Override
    public String toString() {
        if (super.cards.isEmpty()) {
            return "<vacío>";
        }
        return super.cards.get(super.cards.size() - 1).toString();
    }

}
