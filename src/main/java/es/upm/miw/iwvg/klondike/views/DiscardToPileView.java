package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.DiscardToPileController;

public class DiscardToPileView implements ViewInterface {

    private DiscardToPileController discardToPileController;

    public DiscardToPileView(OptionControllerInterface controller) {
        discardToPileController = (DiscardToPileController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
