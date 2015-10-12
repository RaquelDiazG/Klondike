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
        IO io = new IO();
        if (discard.isEmpty()) {
            io.writeln("¡ERROR! No hay cartas en el descarte para colocar");
        } else {
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
                    io.writeln("¡ERROR! No se puede poner " + cardDiscard + " sobre " + cardPile);
                }
            }
        }
    }
}
