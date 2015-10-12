package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Klondike;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.PileToPileController;

public class PileToPileView implements ViewInterface {

    private PileToPileController pileToPileController;

    public PileToPileView(ControllerInterface controller) {
        pileToPileController = (PileToPileController) controller;
    }

    @Override
    public void render() {
        IO io = new IO();
        int numPileOrigin = io.readInt("De qué escalera? [1-9]:");
        int numCards = io.readInt("Cuántas cartas?:");
        int numPileDestination = io.readInt("A qué escalera? [1-9]:");
        if (numPileOrigin > Klondike.getNumPiles()) {
            io.writeln("¡ERROR! Escalera de origen no válida");
        } else if (numCards > Klondike.getPiles().get(numPileOrigin).getAllCards().size()) {
            io.writeln("¡ERROR! No se pueden elegir más cartas de las que hay en la escalera");
        } else if (numPileDestination > Klondike.getNumPiles()) {
            io.writeln("¡ERROR! Escalera de destino no válida");
        } else {
            pileToPileController.setNumPileOrigin(numPileOrigin);
            pileToPileController.setNumPileDestination(numPileDestination);
            pileToPileController.setNumCards(numCards);
            pileToPileController.control();
        }

    }

}
