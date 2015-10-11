package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;

public class DiscardToDeckController extends ControllerAbstract {

    public DiscardToDeckController() {
        super();
    }

    @Override
    public void control() {
        System.out.println("Controlador - Mover de descarte a baraja");
        IO io = new IO();
        if (!deck.getCards().isEmpty()) {
            io.writeln("¡ERROR! NO SE PUEDE MOVER DE DESCARTE A BARAJA PORQUE LA BARAJA NO ESTÁ VACÍA");
        } else {
            deck.setCards(discard.getCards());
            discard.remove();
        }

    }
}
