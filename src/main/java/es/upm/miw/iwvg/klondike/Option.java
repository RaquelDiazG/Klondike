package es.upm.miw.iwvg.klondike;

import java.util.Map;

import es.upm.miw.iwvg.klondike.options.DeckToDiscardController;
import es.upm.miw.iwvg.klondike.options.DiscardToDeckController;
import es.upm.miw.iwvg.klondike.options.DiscardToPileController;
import es.upm.miw.iwvg.klondike.options.DiscardToSuitController;
import es.upm.miw.iwvg.klondike.options.FlipController;
import es.upm.miw.iwvg.klondike.options.PileToPileController;
import es.upm.miw.iwvg.klondike.options.PileToSuitController;
import es.upm.miw.iwvg.klondike.options.QuitController;
import es.upm.miw.iwvg.klondike.options.SuitToPileController;
import es.upm.miw.iwvg.klondike.views.DeckToDiscardView;
import es.upm.miw.iwvg.klondike.views.DiscardToDeckView;
import es.upm.miw.iwvg.klondike.views.DiscardToPileView;
import es.upm.miw.iwvg.klondike.views.DiscardToSuitView;
import es.upm.miw.iwvg.klondike.views.FlipView;
import es.upm.miw.iwvg.klondike.views.PileToPileView;
import es.upm.miw.iwvg.klondike.views.PileToSuitView;
import es.upm.miw.iwvg.klondike.views.QuitView;
import es.upm.miw.iwvg.klondike.views.SuitToPileView;

public class Option {

    private int number;

    private OptionControllerInterface optionControllerInterface;

    private ViewInterface viewInterface;

    public Option(int option, Deck deck, Discard discard, Map<Suit, Foundation> foundations, Map<Integer, Pile> piles) {
        number = option;
        switch (option) {
        case 1:
            optionControllerInterface = new DeckToDiscardController(deck, discard);
            viewInterface = new DeckToDiscardView(optionControllerInterface);
            break;
        case 2:
            optionControllerInterface = new DiscardToDeckController();
            viewInterface = new DiscardToDeckView(optionControllerInterface);
            break;
        case 3:
            optionControllerInterface = new DiscardToSuitController();
            viewInterface = new DiscardToSuitView(optionControllerInterface);
            break;
        case 4:
            optionControllerInterface = new DiscardToPileController();
            viewInterface = new DiscardToPileView(optionControllerInterface);
            break;
        case 5:
            optionControllerInterface = new PileToSuitController();
            viewInterface = new PileToSuitView(optionControllerInterface);
            break;
        case 6:
            optionControllerInterface = new PileToPileController();
            viewInterface = new PileToPileView(optionControllerInterface);
            break;
        case 7:
            optionControllerInterface = new SuitToPileController();
            viewInterface = new SuitToPileView(optionControllerInterface);
            break;
        case 8:
            optionControllerInterface = new FlipController();
            viewInterface = new FlipView(optionControllerInterface);
            break;
        case 9:
            optionControllerInterface = new QuitController();
            viewInterface = new QuitView(optionControllerInterface);
            break;
        }

    }

    public void control() {
        viewInterface.render();
    }
}
