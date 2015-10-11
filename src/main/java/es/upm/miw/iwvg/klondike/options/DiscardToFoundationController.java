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
        if (discard.getCards().isEmpty()) {
            io.writeln("¡ERROR! No hay cartas para colocar");
        } else {
            Card card = discard.getLastCard();
            // recuperamos el numero del palo
            int positionFoundation = card.getSuit().position();
            // recuperamos la ultima carta del palo
            Foundation objetiveSuitFundation = foundations.get(positionFoundation);
            if (objetiveSuitFundation.getCards().isEmpty()) {// vacio
                if (card.getCardValue() == CardValue.AS) {// tiene que ser un as
                    objetiveSuitFundation.addCard(card);
                    foundations.put(positionFoundation, objetiveSuitFundation);
                    discard.removeLastCard();
                } else {
                    io.writeln("¡ERROR! " + card + " NO SE PUEDE COLOCAR EN EL PALO VACÍO");
                }
            } else {
                // recuperamos la ultima carta del palo
                Card cardFoundation = objetiveSuitFundation.getLastCard();
                // comprobamos si encaja
                if (card.getCardValue() == cardFoundation.getCardValue().next()) {
                    objetiveSuitFundation.addCard(card);
                    foundations.put(positionFoundation, objetiveSuitFundation);
                    discard.removeLastCard();
                } else {
                    io.writeln("¡ERROR! " + card + " NO SE PUEDE COLOCAR EN " + objetiveSuitFundation);
                }
            }
        }
    }
}
