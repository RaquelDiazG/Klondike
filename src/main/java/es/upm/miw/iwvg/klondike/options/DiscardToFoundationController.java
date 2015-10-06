package es.upm.miw.iwvg.klondike.options;

import java.util.Map;

import es.upm.miw.iwvg.klondike.Card;
import es.upm.miw.iwvg.klondike.CardValue;
import es.upm.miw.iwvg.klondike.Discard;
import es.upm.miw.iwvg.klondike.Foundation;
import es.upm.miw.iwvg.klondike.IO;
import es.upm.miw.iwvg.klondike.OptionControllerInterface;
import es.upm.miw.iwvg.klondike.Suit;

public class DiscardToFoundationController implements OptionControllerInterface {

    private Discard discard;

    private Map<Suit, Foundation> foundations;

    public DiscardToFoundationController(Discard discard, Map<Suit, Foundation> foundations) {
        this.discard = discard;
        this.foundations = foundations;
    }

    @Override
    public void control() {
        IO io = new IO();
        if (discard.getCards().isEmpty()) {
            io.writeln("¡ERROR! No hay cartas para colocar");
        } else {
            // recuperamos la ultima carta del descarte
            int lastIndex = discard.getCards().size() - 1;
            Card card = discard.getCards().get(lastIndex);
            // recuperamos el palo de la carta
            Suit actualSuit = card.getSuit();
            // recuperamos la ultima carta del palo
            Foundation objetiveSuitFundation = foundations.get(actualSuit);
            if (objetiveSuitFundation.getCards().isEmpty()) {// vacio
                if (card.getCardValue() == CardValue.AS) {// tiene que ser un as
                    objetiveSuitFundation.addCard(card);
                    foundations.put(actualSuit, objetiveSuitFundation);
                    discard.getCards().remove(lastIndex);
                } else {
                    io.writeln("¡ERROR! ESA CARTA NO SE PUEDE COLOCAR EN EL PALO");
                }
            } else {
                // recuperamos la ultima carta del palo
                int last = objetiveSuitFundation.getCards().size() - 1;
                Card cardFoundation = objetiveSuitFundation.getCards().get(last);
                // recuperamos siguiente numero de la carta que debe encajar en el palo
                CardValue nextCardValue = card.getCardValue().next();
                // comprobamos si encaja
                if (nextCardValue == cardFoundation.getCardValue().next()) {
                    objetiveSuitFundation.addCard(card);
                    foundations.put(actualSuit, objetiveSuitFundation);
                    discard.getCards().remove(lastIndex);
                } else {
                    io.writeln("¡ERROR! ESA CARTA NO SE PUEDE COLOCAR EN EL PALO");
                }
            }
        }
    }
}
