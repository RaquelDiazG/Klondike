package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
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
                if (cardPile.isNextCardValue(cardDiscard)) {
                    pile.addCardFaceUp(cardDiscard);
                    discard.removeLastCard();
                } else {
                    io.writeln("¡ERROR! No se puede poner " + cardDiscard + " sobre " + cardPile);
                }
            }
        }
    }
}
