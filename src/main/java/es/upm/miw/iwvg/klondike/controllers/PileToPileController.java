package es.upm.miw.iwvg.klondike.controllers;

import java.util.List;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Pile;

public class PileToPileController extends ControllerAbstract {

    private int numPileOrigin;

    private int numPileDestination;

    private int numCards;

    public PileToPileController() {
        super();
    }

    @Override
    public void control() {
        Pile pileOrigin = piles.get(numPileOrigin);
        if (pileOrigin.isEmpty()) {
            io.writeln("¡ERROR! No hay cartas en la escalera de origen " + numPileOrigin + " para mover");
        } else {
            int size = pileOrigin.getCardsFaceUp().size();
            List<Card> cardsOrigin = pileOrigin.getCardsFaceUp().subList(size - numCards, size);
            Card firstCardOrigin = cardsOrigin.get(0);
            Pile pileDestination = piles.get(numPileDestination);
            if (pileDestination.isEmpty()) {
                pileDestination.getCardsFaceUp().addAll(cardsOrigin);
                pileOrigin.getCardsFaceUp().removeAll(cardsOrigin);
            } else {
                Card cardDestination = pileDestination.getLastCardFaceUp();
                if (cardDestination.isNextCardValue(firstCardOrigin)) {
                    pileDestination.getCardsFaceUp().addAll(cardsOrigin);
                    pileOrigin.getCardsFaceUp().removeAll(cardsOrigin);
                } else {
                    io.writeln("ERROR! No se puede mover " + cardsOrigin + " a " + cardDestination);
                }
            }
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
