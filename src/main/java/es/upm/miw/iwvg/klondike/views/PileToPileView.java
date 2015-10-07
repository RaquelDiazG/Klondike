package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.IO;
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
        IO io = new IO();
        int numPileOrigin = io.readInt("De qué escalera? [1-9]:");
        int numCards = io.readInt("Cuántas cartas? [1-9]:");
        int numPileDestination = io.readInt("A qué escalera? [1-9]:");
        // if (numPile > pileToPileController.getNumOptions()) {
        // io.writeln("¡ERROR! ");
        // } else {
        pileToPileController.setPileOrigin(numPileOrigin);
        pileToPileController.setPileDestination(numPileDestination);
        pileToPileController.setNumCards(numCards);
        pileToPileController.control();
        // }

    }

}
