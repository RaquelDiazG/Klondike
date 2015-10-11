package es.upm.miw.iwvg.klondike;

public class MenuController {

    private Option[] options;

    private static final int NUM_OPTIONS = 9; // SINGLETON PATTERN

    public MenuController() {
        options = new Option[NUM_OPTIONS];
        for (int i = 0; i < NUM_OPTIONS; i++) {
            options[i] = new Option(i + 1);
        }
    }

    public void control(int numOption) {
        Option option = options[numOption - 1];
        option.control();
    }

    public boolean end() {
        return Klondike.getDeck().getCards() == null || (Klondike.getDeck().getCards().isEmpty()
                && Klondike.getDiscard().getCards().isEmpty() && Klondike.getPiles().values().isEmpty());
    }

    public static int getNumOptions() { // ACCESS TO SINGLETON PATTERN
        return NUM_OPTIONS;
    }
}
