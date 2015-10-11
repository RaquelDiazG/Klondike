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
        // recuperamos la pila
        Pile objetivePile = piles.get(numObjetivePile);
        // comprobamos que la pila no tiene cartas boca arriba
        if (objetivePile.getCardsFaceUp().isEmpty()) {
            objetivePile.flip();
        } else {
            IO io = new IO();
            io.writeln("¡ERROR! No se puede voltear en una escalera con cartas");
        }
    }

    public void setNumPile(int objetivePile) {
        this.numObjetivePile = objetivePile;
    }

}
