package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.DeckToDiscardController;

public class DeckToDiscardView implements ViewInterface {

    private DeckToDiscardController deckToDiscardController;

    public DeckToDiscardView(OptionControllerInterface controller) {
        deckToDiscardController = (DeckToDiscardController) controller;
    }

    public void render() {
        System.out.println("Vista - Mover de baraja a descarte");
        deckToDiscardController.control();

    }

}
