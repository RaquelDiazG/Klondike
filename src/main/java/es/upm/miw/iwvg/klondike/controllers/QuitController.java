package es.upm.miw.iwvg.klondike.controllers;

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
