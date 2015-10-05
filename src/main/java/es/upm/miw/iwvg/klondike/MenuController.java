package es.upm.miw.iwvg.klondike;

import java.util.HashMap;
import java.util.Map;

public class MenuController {

    private Option[] options;

    private static final int NUM_OPTIONS = 9;

    private static final int NUM_FUNDATIONS = 7;

    private static final int NUM_PILES = 4;

    private static Deck deck;

    private DeckRest deckRest;

    private Discard discard;

    // private Foundation[] foundations;
    private Map<Suit, Foundation> foundations;

    // private Pile[] piles;
    private Map<Integer, Pile> piles;

    public MenuController() {
        deck = new Deck();
        discard = new Discard();

        foundations = new HashMap<>();
        foundations.put(Suit.valueOf("O"), new Foundation(Suit.valueOf("O")));
        foundations.put(Suit.valueOf("C"), new Foundation(Suit.valueOf("C")));
        foundations.put(Suit.valueOf("E"), new Foundation(Suit.valueOf("E")));
        foundations.put(Suit.valueOf("B"), new Foundation(Suit.valueOf("B")));

        piles = new HashMap<>();
        piles.put(1, new Pile(1, deck));
        piles.put(2, new Pile(2, deck));
        piles.put(3, new Pile(3, deck));
        piles.put(4, new Pile(4, deck));
        piles.put(5, new Pile(5, deck));
        piles.put(6, new Pile(6, deck));
        piles.put(7, new Pile(7, deck));

        deckRest = new DeckRest(deck);

        options = new Option[NUM_OPTIONS];
        for (int i = 0; i < NUM_OPTIONS; i++) {
            options[i] = new Option(i + 1);
        }
    }

    public void control(int numOption) {
        System.out.println("OPCION SELECCIONADA " + numOption);
        Option option = options[numOption - 1];
        option.control();
    }

    public Deck getDeck() {
        return deck;
    }

    public DeckRest getDeckRest() {
        return deckRest;
    }

    public Discard getDiscard() {
        return discard;
    }

    public Foundation getFoundation(Suit suit) {
        return foundations.get(suit);
    }

    public Pile getPile(int position) {
        return piles.get(position);
    }
}
