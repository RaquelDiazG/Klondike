package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.FlipController;

public class FlipView implements ViewInterface {

    private FlipController flipController;

    public FlipView(OptionControllerInterface controller) {
        flipController = (FlipController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
