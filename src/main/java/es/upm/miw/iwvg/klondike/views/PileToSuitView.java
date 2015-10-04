package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.PileToSuitController;

public class PileToSuitView implements ViewInterface {

    private PileToSuitController pileToSuitController;

    public PileToSuitView(OptionControllerInterface controller) {
        pileToSuitController = (PileToSuitController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
