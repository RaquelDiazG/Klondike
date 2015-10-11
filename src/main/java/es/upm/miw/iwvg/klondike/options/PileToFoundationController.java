package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Pile;

public class PileToFoundationController extends ControllerAbstract {

    private int numPile;

    public PileToFoundationController() {
        super();
    }

    @Override
    public void control() {
        IO io = new IO();
        Pile pile = piles.get(numPile);
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
            if (cardPile.getCardValue() == cardFoundation.getCardValue().next()) {
                foundation.addCard(cardPile);
                pile.removeLastCardFaceUp();
            } else {
                io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre " + cardFoundation);
            }
        }
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }
}
