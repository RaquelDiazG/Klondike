package es.upm.miw.iwvg.klondike.options;

import java.util.List;
import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;

public class PileToPileController implements OptionControllerInterface {

    private Map<Integer, Pile> piles;

    private int numPileOrigin;

    private int numPileDestination;

    private int numCards;

    public PileToPileController(Map<Integer, Pile> piles) {
        this.piles = piles;
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
        if (firstCardOrigin.getCardValue() == cardDestination.getCardValue().previous()) {
            // añadimos las cartas a la pila de destino
            piles.get(numPileDestination).getCardsFaceUp().addAll(cardsOrigin);
            // borramos las cartas de la pila de origen
            piles.get(numPileOrigin).getCardsFaceUp().removeAll(cardsOrigin);
        } else {
            IO io = new IO();
            io.writeln("ERROR! No se puede mover a la escalera");
        }
    }

    public void setPileOrigin(int numPileOrigin) {
        this.numPileOrigin = numPileOrigin;
    }

    public void setPileDestination(int numPileDestination) {
        this.numPileDestination = numPileDestination;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }
}
