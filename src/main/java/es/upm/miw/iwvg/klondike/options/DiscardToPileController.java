package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Pile;

public class DiscardToPileController extends ControllerAbstract {

    private int numPile;

    public DiscardToPileController() {
        super();
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }

    @Override
    public void control() {
        Card cardDiscard = discard.getLastCard();
        Pile pile = piles.get(numPile);
        if (pile.isEmpty()) {
            pile.addCardFaceUp(cardDiscard);
            discard.removeLastCard();
        } else {
            Card cardPile = pile.getLastCardFaceUp();
            if (cardDiscard.getCardValue().next() == cardPile.getCardValue()) {
                pile.addCardFaceUp(cardDiscard);
                discard.removeLastCard();
            } else {
                IO io = new IO();
                io.writeln("¡ERROR! No se puede poner " + cardDiscard + " sobre " + cardPile);
            }
        }
    }
}
