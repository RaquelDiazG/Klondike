package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
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
        // recuperamos la ultima carta de la pila
        Pile objetivePile = piles.get(numObjetivePile);
        if (objetivePile.getCards().isEmpty()) { // pila vacia
            objetivePile.addCard(card);
            piles.put(numObjetivePile, objetivePile);
            discard.removeLastCard();
        } else {
            // recuperamos la ultima carta de la pila
            Card cardPile = objetivePile.getLastCard();
            // recuperamos numero anterior de la carta que debe encajar en el palo
            CardValue previousCardValue = card.getCardValue().previous();
            // comprobamos si encaja
            if (previousCardValue == cardPile.getCardValue().previous()) {
                objetivePile.addCard(card);
                piles.put(numObjetivePile, objetivePile);
                discard.removeLastCard();
            } else {
                IO io = new IO();
                io.writeln("¡ERROR! ESA CARTA NO SE PUEDE COLOCAR EN EL PALO");
            }
        }
    }
}
