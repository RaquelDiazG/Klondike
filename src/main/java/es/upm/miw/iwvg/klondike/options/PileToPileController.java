package es.upm.miw.iwvg.klondike.options;

import java.util.List;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;

public class PileToPileController extends ControllerAbstract {

    private int numPileOrigin;

    private int numPileDestination;

    private int numCards;

    public PileToPileController() {
        super();
    }

    @Override
    public void control() {
        // recuperamos las cartas de la pila de origen
        int size = piles.get(numPileOrigin).getCardsFaceUp().size();
        List<Card> cardsOrigin = piles.get(numPileOrigin).getCardsFaceUp().subList(size - numCards, size);
        Card firstCardOrigin = cardsOrigin.get(0);
        // recuperamos la ultima carta de la pila de destino
        Card cardDestination = piles.get(numPileDestination).getLastCardFaceUp();
        // comprobamos si encaja
        if (firstCardOrigin.getCardValue().next() == cardDestination.getCardValue()) {
            // añadimos las cartas a la pila de destino
            piles.get(numPileDestination).getCardsFaceUp().addAll(cardsOrigin);
            // borramos las cartas de la pila de origen
            piles.get(numPileOrigin).getCardsFaceUp().removeAll(cardsOrigin);
        } else {
            IO io = new IO();
            io.writeln("ERROR! No se puede mover a la escalera");
        }
    }

    public void setNumPileOrigin(int numPileOrigin) {
        this.numPileOrigin = numPileOrigin;
    }

    public void setNumPileDestination(int numPileDestination) {
        this.numPileDestination = numPileDestination;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }
}
