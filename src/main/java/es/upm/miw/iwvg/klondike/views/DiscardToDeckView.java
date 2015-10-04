package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.DiscardToDeckController;

public class DiscardToDeckView implements ViewInterface {

    private DiscardToDeckController discardToDeckController;

    public DiscardToDeckView(OptionControllerInterface controller) {
        discardToDeckController = (DiscardToDeckController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
