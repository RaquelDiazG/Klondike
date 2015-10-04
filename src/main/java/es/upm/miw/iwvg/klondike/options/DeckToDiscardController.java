package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.OptionControllerInterface;

public class DeckToDiscardController implements OptionControllerInterface {
    public DeckToDiscardController() {
        System.out.println("SOY EL CONTROLADOR DeckToDiscardController");
    }

    @Override
    public void control() {
        System.out.println("soy el controlador DeckToDiscardController");

    }
}
