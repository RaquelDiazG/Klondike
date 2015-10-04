package es.upm.miw.iwvg.klondike;

public class MenuController {

    private Option[] options;

    private static final int NUM_OPTIONS = 9;

    private Deck deck;

    private Discard discard;

    private Foundation[] foundations;

    private Pile[] piles;

    public MenuController() {
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
}
