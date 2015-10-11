package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.Klondike;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;

public class FlipController implements OptionControllerInterface {

    private Map<Integer, Pile> piles;

    private int numObjetivePile;

    public FlipController() {
        this.piles = Klondike.getPiles();
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
