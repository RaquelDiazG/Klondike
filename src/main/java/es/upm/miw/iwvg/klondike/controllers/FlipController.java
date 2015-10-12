package es.upm.miw.iwvg.klondike.controllers;

import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Pile;

public class FlipController extends ControllerAbstract {

    private int numPile;

    public FlipController() {
        super();
    }

    @Override
    public void control() {
        Pile pile = piles.get(numPile);
        if (pile.isEmpty()) {
            io.writeln("¡ERROR! No se puede voltear en una escalera vacía");
        } else if (pile.getCardsFaceUp().isEmpty()) {
            pile.flip();
        } else {
            io.writeln("¡ERROR! No se puede voltear en una escalera con cartas");
        }
    }

    public void setNumPile(int numPile) {
        this.numPile = numPile;
    }

}
