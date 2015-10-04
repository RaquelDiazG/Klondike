package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.PileToPileController;

public class PileToPileView implements ViewInterface {

    private PileToPileController pileToPileController;

    public PileToPileView(OptionControllerInterface controller) {
        pileToPileController = (PileToPileController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
