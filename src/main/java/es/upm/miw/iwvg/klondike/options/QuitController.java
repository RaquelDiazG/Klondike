package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Deck;
import es.upm.miw.iwvg.klondike.Discard;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Pile;
import es.upm.miw.iwvg.klondike.Suit;

public class QuitController implements OptionControllerInterface {

    private Deck deck;

    private Discard discard;

    private Map<Suit, Foundation> foundations;

    private Map<Integer, Pile> piles;

    public QuitController(Deck deck, Discard discard, Map<Suit, Foundation> foundations, Map<Integer, Pile> piles) {
        this.deck = deck;
        this.discard = discard;
        this.foundations = foundations;
        this.piles = piles;
    }

    @Override
    public void control() {
        this.deck.end();
    }
}
