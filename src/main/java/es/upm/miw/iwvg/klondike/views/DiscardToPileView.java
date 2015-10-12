package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Klondike;
import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.DiscardToPileController;

public class DiscardToPileView implements ViewInterface {

    private DiscardToPileController discardToPileController;

    public DiscardToPileView(ControllerInterface controller) {
        discardToPileController = (DiscardToPileController) controller;
    }

    @Override
    public void render() {
        IO io = new IO();
        int numPile = io.readInt("A qué escalera? [1-7]:");
        if (numPile > Klondike.getNumPiles()) {
            io.writeln("¡ERROR! Escalera no válida");
        } else {
            discardToPileController.setNumPile(numPile);
            discardToPileController.control();
        }
    }

}
