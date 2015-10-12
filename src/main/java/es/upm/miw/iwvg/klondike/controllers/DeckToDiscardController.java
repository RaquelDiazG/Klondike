package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;

public class DeckToDiscardController extends ControllerAbstract {

    private static final int MAX_CARDS_DISCARD = 3;

    public DeckToDiscardController() {
        super();
    }

    @Override
    public void control() {
        if (deck.isEmpty()) {
            io.writeln("¡ERROR!La baraja está vacía");
        } else {
            int count = 0;
            while (count < MAX_CARDS_DISCARD && !deck.isEmpty()) {
                Card card = deck.getCards().get(0);
                deck.getCards().remove(0);
                discard.addCard(card);
                count++;
            }
        }

    }

}
