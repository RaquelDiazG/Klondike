package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.IO;

public class DeckToDiscardController extends ControllerAbstract {

    private static final int MAX_CARDS_DISCARD = 3;

    public DeckToDiscardController() {
        super();
    }

    @Override
    public void control() {
        IO io = new IO();
        if (deck.isEmpty()) {
            io.writeln("¡ERROR!La baraja está vacía");
        } else {
            int count = 0;
            while (count < MAX_CARDS_DISCARD && !deck.isEmpty()) {
                Card card = deck.getCards().get(0);
                deck.getCards().remove(0);
                discard.getCards().add(card);
                count++;
            }
        }

    }

}
