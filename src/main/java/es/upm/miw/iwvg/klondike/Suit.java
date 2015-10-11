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

    public Integer position() {
        return this.ordinal() + 1;
    }
}
