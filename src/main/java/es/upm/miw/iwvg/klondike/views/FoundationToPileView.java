package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Klondike;
import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.FundationToPileController;

public class FoundationToPileView implements ViewInterface {

    private FundationToPileController suitToPileController;

    public FoundationToPileView(ControllerInterface controller) {
        suitToPileController = (FundationToPileController) controller;
    }

    @Override
    public void render() {
        IO io = new IO();
        int numFoundation = io.readInt("De qué palo? [1-4]:");
        int numPile = io.readInt("A qué escalera? [1-7]:");
        if (numFoundation > Klondike.getNumFoundations()) {
            io.writeln("¡ERROR! Palo no válido");
        } else if (numPile > Klondike.getNumPiles()) {
            io.writeln("¡ERROR! Escalera no válida");
        } else {
            suitToPileController.setNumFoundation(numFoundation);
            suitToPileController.setNumPile(numPile);
            suitToPileController.control();
        }
    }

}
