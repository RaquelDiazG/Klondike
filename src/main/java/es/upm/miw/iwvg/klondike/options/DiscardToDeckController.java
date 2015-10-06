package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Deck;
import es.upm.miw.iwvg.klondike.Discard;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;

public class DiscardToDeckController implements OptionControllerInterface {

    private Deck deck;

    private Discard discard;

    public DiscardToDeckController(Deck deck, Discard discard) {
        this.deck = deck;
        this.discard = discard;
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
