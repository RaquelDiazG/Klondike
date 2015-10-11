package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.ControllerAbstract;

public class QuitController extends ControllerAbstract {

    public QuitController() {
        super();
    }

    @Override
    public void control() {
        deck.end();
    }
}
