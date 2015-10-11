package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
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
        // recuperamos las cartas del palo
        if (foundations.get(cardPile.getSuit()).getCards().isEmpty()) {// vacio
            if (cardPile.getCardValue() == CardValue.AS) {
                // añadimos la carta al palo
                foundations.get(cardPile.getSuit()).addCard(cardPile);
                // eliminamos la carta de la pila
                piles.get(numPile).removeLastCardFaceUp();
            } else {
                io.writeln("¡ERROR! No se puede poner " + cardPile + " sobre el palo vacio");
            }
        } else {
            // recuperamos la ultima carta del palo
            Card cardFoundation = foundations.get(cardPile.getSuit()).getLastCard();
            // comprobamos si encaja
            if (cardPile.getCardValue() == cardFoundation.getCardValue().previous()) {
                // añadimos la carta al palo
                foundations.get(cardPile.getSuit()).addCard(cardPile);
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
