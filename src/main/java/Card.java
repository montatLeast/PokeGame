public class Card {
    private int value;
    private String color;

    public static final int VALUE_T = 10;
    public static final int VALUE_J = 11;
    public static final int VALUE_Q = 12;
    public static final int VALUE_K = 13;
    public static final int VALUE_A = 14;

    public Card(int value, String color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
