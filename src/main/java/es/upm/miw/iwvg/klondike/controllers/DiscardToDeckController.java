package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.ControllerAbstract;

public class DiscardToDeckController extends ControllerAbstract {

    public DiscardToDeckController() {
        super();
    }

    @Override
    public void control() {
        if (!deck.isEmpty()) {
            io.writeln("¡ERROR! La baraja no está vacía");
        } else {
            deck.setCards(discard.getCards());
            discard.removeAll();
        }

    }
}
