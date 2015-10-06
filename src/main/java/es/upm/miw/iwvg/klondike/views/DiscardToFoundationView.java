package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.DiscardToFoundationController;

public class DiscardToFoundationView implements ViewInterface {

    private DiscardToFoundationController discardToSuitController;

    public DiscardToFoundationView(OptionControllerInterface controller) {
        discardToSuitController = (DiscardToFoundationController) controller;
    }

    @Override
    public void render() {
        discardToSuitController.control();
    }

}
