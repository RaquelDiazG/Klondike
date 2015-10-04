package es.upm.miw.iwvg.klondike;

public class Klondike {

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
