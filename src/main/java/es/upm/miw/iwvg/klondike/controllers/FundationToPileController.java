package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.Pile;

public class FundationToPileController extends ControllerAbstract {

    private int numPile;

    private int numFoundation;

    public FundationToPileController() {
        super();
    }

    @Override
    public void control() {
        Foundation foundation = foundations.get(numFoundation);
        if (foundation.isEmpty()) {
            io.writeln("¡ERROR! No hay cartas en el palo para mover");
        } else {
            Card cardFoundation = foundation.getLastCard();
            Pile pile = piles.get(numPile);
            if (pile.isEmpty()) {
                pile.addCardFaceUp(cardFoundation);
                foundation.removeLastCard();
            } else if (pile.getCardsFaceUp().isEmpty()) {
                io.writeln("¡ERROR! Es necesario voltear la carta de la escalera");
            } else {
                Card cardPile = pile.getLastCardFaceUp();
                if (cardPile.isNextCardValue(cardFoundation)) {
                    pile.addCardFaceUp(cardFoundation);
                    foundation.removeLastCard();
                } else {
                    io.writeln("¡ERROR! No se puede poner " + cardFoundation + " sobre " + cardPile);
                }
            }
        }
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }

    public void setNumFoundation(int numFoundation) {
        this.numFoundation = numFoundation;
    }
}
