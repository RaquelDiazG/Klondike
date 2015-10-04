package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.options.QuitController;

public class QuitView implements ViewInterface {
    private QuitController quitController;

    public QuitView(OptionControllerInterface controller) {
        quitController = (QuitController) controller;
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
