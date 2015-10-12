package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.DiscardToDeckController;

public class DiscardToDeckView implements ViewInterface {

    private DiscardToDeckController discardToDeckController;

    public DiscardToDeckView(ControllerInterface controller) {
        discardToDeckController = (DiscardToDeckController) controller;
    }

    @Override
    public void render() {
        discardToDeckController.control();

    }

}
