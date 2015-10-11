package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;

public class DiscardToDeckController extends ControllerAbstract {

    public DiscardToDeckController() {
        super();
    }

    @Override
    public void control() {
        if (!deck.isEmpty()) {
            IO io = new IO();
            io.writeln("¡ERROR! La baraja no está vacía");
        } else {
            deck.setCards(discard.getCards());
            discard.removeAll();
        }

    }
}
