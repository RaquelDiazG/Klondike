package es.upm.miw.iwvg.klondike;

import java.util.Map;

public abstract class ControllerAbstract implements ControllerInterface {

    protected Deck deck;

    protected Discard discard;

    protected Map<Integer, Foundation> foundations;

    protected Map<Integer, Pile> piles;

    public ControllerAbstract() {
        this.deck = Klondike.getDeck();
        this.discard = Klondike.getDiscard();
        this.foundations = Klondike.getFoundations();
        this.piles = Klondike.getPiles();
    }

}
