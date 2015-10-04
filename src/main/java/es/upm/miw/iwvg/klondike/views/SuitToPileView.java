package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.SuitToPileController;

public class SuitToPileView implements ViewInterface {
    private SuitToPileController suitToPileController;

    public SuitToPileView(OptionControllerInterface controller) {
        suitToPileController = (SuitToPileController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
