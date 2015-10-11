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
        System.out.println("Controlador - Mover de baraja a descarte");
        IO io = new IO();
        if (deck.getCards().isEmpty()) {
            io.writeln("¡ERROR! NO SE PUEDE MOVER DE BARAJA A DESCARTE PORQUE LA BARAJA ESTÁ VACÍA");
        } else {
            int count = 0;
            while (count < MAX_CARDS_DISCARD && !deck.getCards().isEmpty()) {
                Card card = deck.getCards().get(0);
                deck.getCards().remove(0);
                discard.getCards().add(card);
                count++;
            }
        }

    }

}
