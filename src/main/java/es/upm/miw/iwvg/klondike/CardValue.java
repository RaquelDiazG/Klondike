package es.upm.miw.iwvg.klondike;

public enum CardValue {

    AS("A"), DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"), NUEVE("9"), DIEZ("10"), J("J"), Q("Q"), K("K");

    private String value;

    private CardValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public CardValue next() {
        CardValue[] values = values();
        return values[(this.ordinal() + 1) % values.length];
    }
}
