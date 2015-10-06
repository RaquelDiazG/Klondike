package es.upm.miw.iwvg.klondike;

import java.util.Map;

public class Klondike {

    private static Deck deck;

    private static Discard discard;

    private static Map<Suit, Foundation> foundations;

    private static Map<Integer, Pile> piles;

    private MenuView menuView;

    private MenuController menuController;

    public Klondike() {
        menuController = new MenuController();
        menuView = new MenuView(menuController);
    }

    public void play() {
        menuView.render();
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

}
