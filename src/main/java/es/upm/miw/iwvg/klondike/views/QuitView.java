package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.QuitController;

public class QuitView implements ViewInterface {

    private QuitController quitController;

    public QuitView(ControllerInterface controller) {
        quitController = (QuitController) controller;
    }

    @Override
    public void render() {
        IO io = new IO();
        io.write("¡Adiós!");
        quitController.control();
    }

}
