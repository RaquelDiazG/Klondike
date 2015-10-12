package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.Pile;

public class PileToFoundationController extends ControllerAbstract {

    private int numPile;

    public PileToFoundationController() {
        super();
    }

    @Override
    public void control() {
        Pile pile = piles.get(numPile);
        if (pile.isEmpty()) {
            io.writeln("¡ERROR! No hay cartas en la escalera para mover");
        } else if (pile.getCardsFaceUp().isEmpty()) {
            io.writeln("¡ERROR! Es necesario voltear la carta de la escalera");
        } else {
            Card cardPile = pile.getLastCardFaceUp();
            int numPile = cardPile.getSuit().position();
            Foundation foundation = foundations.get(numPile);
            if (foundation.isEmpty()) {
                if (cardPile.getCardValue() == CardValue.AS) {
                    foundation.addCard(cardPile);
                    pile.removeLastCardFaceUp();
                } else {
                    io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre el palo vacio");
                }
            } else {
                Card cardFoundation = foundation.getLastCard();
                if (cardPile.isNextCardValue(cardFoundation)) {
                    foundation.addCard(cardPile);
                    pile.removeLastCardFaceUp();
                } else {
                    io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre " + cardFoundation);
                }
            }
        }
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }
}
