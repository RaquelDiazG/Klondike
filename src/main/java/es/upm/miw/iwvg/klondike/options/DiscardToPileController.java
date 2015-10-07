package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.Discard;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;

public class DiscardToPileController implements OptionControllerInterface {
    private Discard discard;

    private Map<Integer, Pile> piles;

    private int numObjetivePile;

    private static final int NUM_PILES = 7;

    public DiscardToPileController(Discard discard, Map<Integer, Pile> piles) {
        this.discard = discard;
        this.piles = piles;
    }

    public void setObjetivePile(int objetivePile) {
        this.numObjetivePile = objetivePile;
    }

    public int getNumPiles() {
        return NUM_PILES;
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
