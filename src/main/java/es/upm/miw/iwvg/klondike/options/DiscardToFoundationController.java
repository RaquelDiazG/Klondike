package es.upm.miw.iwvg.klondike.options;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.ControllerAbstract;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;

public class DiscardToFoundationController extends ControllerAbstract {

    public DiscardToFoundationController() {
        super();
    }

    @Override
    public void control() {
        IO io = new IO();
        if (discard.isEmpty()) {
            io.writeln("¡ERROR! No hay cartas en el descarte para colocar");
        } else {
            Card cardDiscard = discard.getLastCard();
            int numFoundation = cardDiscard.getSuit().position();
            Foundation foundation = foundations.get(numFoundation);
            if (foundation.isEmpty()) {
                if (cardDiscard.getCardValue() == CardValue.AS) {
                    foundation.addCard(cardDiscard);
                    discard.removeLastCard();
                } else {
                    io.writeln("¡ERROR! " + cardDiscard + " no se puede colocar en el palo vacío");
                }
            } else {
                Card cardFoundation = foundation.getLastCard();
                if (cardDiscard.getCardValue() == cardFoundation.getCardValue().next()) {
                    foundation.addCard(cardDiscard);
                    discard.removeLastCard();
                } else {
                    io.writeln("¡ERROR! " + cardDiscard + " no se puede colocar sobre " + foundation);
                }
            }
        }
    }
}
