package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.DiscardToFoundationController;

public class DiscardToFoundationView implements ViewInterface {

    private DiscardToFoundationController discardToSuitController;

    public DiscardToFoundationView(ControllerInterface controller) {
        discardToSuitController = (DiscardToFoundationController) controller;
    }

    @Override
    public void render() {
        discardToSuitController.control();
    }

}
