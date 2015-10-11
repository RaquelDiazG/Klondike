package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Pile;

public class FlipController extends ControllerAbstract {

    private int numObjetivePile;

    public FlipController() {
        super();
    }

    @Override
    public void control() {
        IO io = new IO();
        Pile pile = piles.get(numObjetivePile);
        if (pile.isEmpty()) {
            io.writeln("¡ERROR! No se puede voltear en una escalera vacía");
        } else if (pile.getCardsFaceUp().isEmpty()) {
            pile.flip();
        } else {
            io.writeln("¡ERROR! No se puede voltear en una escalera con cartas");
        }
    }

    public void setNumPile(int objetivePile) {
        this.numObjetivePile = objetivePile;
    }

}
