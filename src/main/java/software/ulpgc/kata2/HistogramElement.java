package software.ulpgc.kata2;

public class HistogramElement {
    private final String field;
    private final int value;

    public HistogramElement(String field, int value) {
        this.field = String.valueOf(field);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getField() {
        return field;
    }
}
