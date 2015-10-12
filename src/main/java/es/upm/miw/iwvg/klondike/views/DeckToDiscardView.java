package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.DeckToDiscardController;

public class DeckToDiscardView implements ViewInterface {

    private DeckToDiscardController deckToDiscardController;

    public DeckToDiscardView(ControllerInterface controller) {
        deckToDiscardController = (DeckToDiscardController) controller;
    }

    @Override
    public void render() {
        deckToDiscardController.control();
    }

}
