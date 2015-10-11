package es.upm.miw.iwvg.klondike;

import es.upm.miw.iwvg.klondike.options.DeckToDiscardController;
import es.upm.miw.iwvg.klondike.options.DiscardToDeckController;
import es.upm.miw.iwvg.klondike.options.DiscardToFoundationController;
import es.upm.miw.iwvg.klondike.options.DiscardToPileController;
import es.upm.miw.iwvg.klondike.options.FlipController;
import es.upm.miw.iwvg.klondike.options.FundationToPileController;
import es.upm.miw.iwvg.klondike.options.PileToFoundationController;
import es.upm.miw.iwvg.klondike.options.PileToPileController;
import es.upm.miw.iwvg.klondike.options.QuitController;
import es.upm.miw.iwvg.klondike.views.DeckToDiscardView;
import es.upm.miw.iwvg.klondike.views.DiscardToDeckView;
import es.upm.miw.iwvg.klondike.views.DiscardToFoundationView;
import es.upm.miw.iwvg.klondike.views.DiscardToPileView;
import es.upm.miw.iwvg.klondike.views.FlipView;
import es.upm.miw.iwvg.klondike.views.FoundationToPileView;
import es.upm.miw.iwvg.klondike.views.PileToFoundationView;
import es.upm.miw.iwvg.klondike.views.PileToPileView;
import es.upm.miw.iwvg.klondike.views.QuitView;

public class Option {

    private int number;

    private ControllerInterface optionControllerInterface;

    private ViewInterface viewInterface;

    public Option(int option) {
        number = option;
        switch (option) {
        case 1:
            optionControllerInterface = new DeckToDiscardController();
            viewInterface = new DeckToDiscardView(optionControllerInterface);
            break;
        case 2:
            optionControllerInterface = new DiscardToDeckController();
            viewInterface = new DiscardToDeckView(optionControllerInterface);
            break;
        case 3:
            optionControllerInterface = new DiscardToFoundationController();
            viewInterface = new DiscardToFoundationView(optionControllerInterface);
            break;
        case 4:
            optionControllerInterface = new DiscardToPileController();
            viewInterface = new DiscardToPileView(optionControllerInterface);
            break;
        case 5:
            optionControllerInterface = new PileToFoundationController();
            viewInterface = new PileToFoundationView(optionControllerInterface);
            break;
        case 6:
            optionControllerInterface = new PileToPileController();
            viewInterface = new PileToPileView(optionControllerInterface);
            break;
        case 7:
            optionControllerInterface = new FundationToPileController();
            viewInterface = new FoundationToPileView(optionControllerInterface);
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
