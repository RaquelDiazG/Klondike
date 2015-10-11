package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Pile;

public class DiscardToPileController extends ControllerAbstract {

    private int numObjetivePile;

    public DiscardToPileController() {
        super();
    }

    public void setObjetivePile(int objetivePile) {
        this.numObjetivePile = objetivePile;
    }

    @Override
    public void control() {
        // recuperamos la ultima carta del descarte
        Card card = discard.getLastCard();
        // recuperamos la pila
        Pile objetivePile = piles.get(numObjetivePile);
        if (objetivePile.getCards().isEmpty()) { // pila vacia
            objetivePile.addCardFaceUp(card);
            piles.put(numObjetivePile, objetivePile);
            discard.removeLastCard();
        } else {
            // recuperamos la ultima carta de la pila
            Card cardPile = objetivePile.getLastCardFaceUp();
            // comprobamos si encaja
            if (card.getCardValue() == cardPile.getCardValue().previous()) {
                objetivePile.addCardFaceUp(card);
                piles.put(numObjetivePile, objetivePile);
                discard.removeLastCard();
            } else {
                IO io = new IO();
                io.writeln("¡ERROR! No se puede poner " + card + " sobre " + cardPile);
            }
        }
    }
}
