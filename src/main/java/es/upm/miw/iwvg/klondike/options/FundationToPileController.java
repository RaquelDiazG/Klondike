package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;
import es.upm.miw.iwvg.klondike.Suit;

public class FundationToPileController implements OptionControllerInterface {
    private Map<Suit, Foundation> foundations;

    private Map<Integer, Pile> piles;

    private static final int NUM_PILES = 7;

    private static final int NUM_FOUNDATIONS = 4;

    private int numPile;

    private int numFoundation;

    public FundationToPileController(Map<Suit, Foundation> foundations, Map<Integer, Pile> piles) {
        this.foundations = foundations;
        this.piles = piles;
    }

    @Override
    public void control() {
        // recuperamos la ultima carta del palo
        Suit suit = Suit.getValue(numFoundation - 1);
        Card cardFoundation = foundations.get(suit).getLastCard();
        // recuperamos la pila
        Pile objetivePile = piles.get(numPile);
        if (objetivePile.getCards().isEmpty()) { // pila vacia
            objetivePile.addCardFaceUp(cardFoundation);
            piles.put(numPile, objetivePile);
            foundations.get(suit).removeLastCard();
        } else {
            // recuperamos la ultima carta de la pila
            Card cardPile = objetivePile.getLastCardFaceUp();
            // comprobamos si encaja
            if (cardFoundation.getCardValue() == cardPile.getCardValue().previous()) {
                objetivePile.addCardFaceUp(cardFoundation);
                foundations.get(suit).removeLastCard();
            } else {
                IO io = new IO();
                io.writeln("¡ERROR! No se puede poner " + cardFoundation + " sobre " + cardPile);
            }
        }

    }

    public int getNumPiles() {
        return NUM_PILES;
    }

    public int getNumFoundations() {
        return NUM_FOUNDATIONS;
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }

    public void setNumFoundation(int numFoundation) {
        this.numFoundation = numFoundation;
    }
}
