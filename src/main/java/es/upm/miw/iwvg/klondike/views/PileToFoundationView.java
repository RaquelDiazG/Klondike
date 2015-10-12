package es.upm.miw.iwvg.klondike.views;

import es.upm.miw.iwvg.klondike.ControllerInterface;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Klondike;
import es.upm.miw.iwvg.klondike.ViewInterface;
import es.upm.miw.iwvg.klondike.controllers.PileToFoundationController;

public class PileToFoundationView implements ViewInterface {

    private PileToFoundationController pileToSuitController;

    public PileToFoundationView(ControllerInterface controller) {
        pileToSuitController = (PileToFoundationController) controller;
    }

    @Override
    public void render() {
        IO io = new IO();
        int numPile = io.readInt("De qué escalera? [1-7]:");
        if (numPile > Klondike.getNumPiles()) {
            io.writeln("¡ERROR! Escalera no válida");
        } else {
            pileToSuitController.setNumPile(numPile);
            pileToSuitController.control();
        }
    }

}
