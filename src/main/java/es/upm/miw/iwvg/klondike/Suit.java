package es.upm.miw.iwvg.klondike;

public enum Suit {

    O('o'), C('c'), E('e'), B('b');

    private char value;

    private Suit(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public Suit next() {
        Suit[] values = values();
        return values[(this.ordinal() + 1) % values.length];
    }
}
