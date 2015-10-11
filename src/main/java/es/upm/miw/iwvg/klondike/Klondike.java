package es.upm.miw.iwvg.klondike;

import java.util.HashMap;
import java.util.Map;

public class Klondike {

    private static Deck deck; // SINGLETON PATTERN

    private static Discard discard; // SINGLETON PATTERN

    private static Map<Integer, Foundation> foundations;// SINGLETON PATTERN

    private static Map<Integer, Pile> piles;// SINGLETON PATTERN

    private static final int NUM_PILES = 7;// SINGLETON PATTERN

    private static final int NUM_FOUNDATIONS = 4;// SINGLETON PATTERN

    private MenuView menuView;

    private MenuController menuController;

    public Klondike() {
        deck = new Deck();
        discard = new Discard();

        foundations = new HashMap<>();
        foundations.put(1, new Foundation(Suit.valueOf("O")));
        foundations.put(2, new Foundation(Suit.valueOf("C")));
        foundations.put(3, new Foundation(Suit.valueOf("E")));
        foundations.put(4, new Foundation(Suit.valueOf("B")));

        piles = new HashMap<>();
        piles.put(1, new Pile(1));
        piles.put(2, new Pile(2));
        piles.put(3, new Pile(3));
        piles.put(4, new Pile(4));
        piles.put(5, new Pile(5));
        piles.put(6, new Pile(6));
        piles.put(7, new Pile(7));

        menuController = new MenuController();
        menuView = new MenuView(menuController);
    }

    public void play() {
        menuView.render();
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

    // ACCESS TO SINGLETON PATTERN

    public static Foundation getFoundation(int position) {
        return foundations.get(position);
    }

    public static Pile getPile(int position) {
        return piles.get(position);
    }

    public static Deck getDeck() {
        return deck;
    }

    public static Discard getDiscard() {
        return discard;
    }

    public static Map<Integer, Foundation> getFoundations() {
        return foundations;
    }

    public static Map<Integer, Pile> getPiles() {
        return piles;
    }

    public static int getNumFoundations() {
        return NUM_FOUNDATIONS;
    }

    public static int getNumPiles() {
        return NUM_PILES;
    }

}
