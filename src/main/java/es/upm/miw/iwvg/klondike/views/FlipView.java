package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.IO;
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
        IO io = new IO();
        int numPile = io.readInt("En qué escalera? [1-7]:");
        if (numPile > flipController.getNumPiles()) {
            io.writeln("¡ERROR! Escalera no válida");
        } else {
            flipController.setNumPile(numPile);
            flipController.control();
        }
    }

}
