package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.Deck;
import es.upm.miw.iwvg.klondike.Discard;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;

public class DeckToDiscardController implements OptionControllerInterface {

    private Deck deck;

    private Discard discard;

    private static final int MAX_CARDS_DISCARD = 3;

    public DeckToDiscardController(Deck deck, Discard discard) {
        this.deck = deck;
        this.discard = discard;
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
