package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.DiscardToSuitController;

public class DiscardToSuitView implements ViewInterface {

    private DiscardToSuitController discardToSuitController;

    public DiscardToSuitView(OptionControllerInterface controller) {
        discardToSuitController = (DiscardToSuitController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
