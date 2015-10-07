package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;
import es.upm.miw.iwvg.klondike.Suit;

public class PileToFoundationController implements OptionControllerInterface {

    private Map<Integer, Pile> piles;

    private Map<Suit, Foundation> foundations;

    private static final int NUM_PILES = 7;

    private int numPile;

    public PileToFoundationController(Map<Integer, Pile> piles, Map<Suit, Foundation> foundations) {
        this.piles = piles;
        this.foundations = foundations;
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

    public int getNumPiles() {
        return NUM_PILES;
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }
}
