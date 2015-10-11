package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;

public class PileToFoundationController extends ControllerAbstract {

    private int numPile;

    public PileToFoundationController() {
        super();
    }

    @Override
    public void control() {
        IO io = new IO();
        // recuperamos la ultima carta de la pila
        Card cardPile = piles.get(numPile).getLastCardFaceUp();
        // recuperamos el numero del palo
        int positionPile = cardPile.getSuit().position();
        // recuperamos el palo
        Foundation foundation = foundations.get(positionPile);
        // recuperamos las cartas del palo
        if (foundation.getCards().isEmpty()) {// vacio
            if (cardPile.getCardValue() == CardValue.AS) {
                // añadimos la carta al palo
                foundation.addCard(cardPile);
                // eliminamos la carta de la pila
                piles.get(numPile).removeLastCardFaceUp();
            } else {
                io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre el palo vacio");
            }
        } else {
            // recuperamos la ultima carta del palo
            Card cardFoundation = foundation.getLastCard();
            // comprobamos si encaja
            if (cardPile.getCardValue() == cardFoundation.getCardValue().next()) {
                // añadimos la carta al palo
                foundation.addCard(cardPile);
                // eliminamos la carta de la pila
                piles.get(numPile).removeLastCardFaceUp();
            } else {
                io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre " + cardFoundation);
            }
        }
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }
}
