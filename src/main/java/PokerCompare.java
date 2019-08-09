public class PokerCompare {

    public static final String PLAYER_1_WIN = "Player 1 Win";
    public static final String PLAYER_2_WIN = "Player 2 Win";
    public static final String EQUAL = "equal";

    public String compare(Card c1, Card c2) {
        int num1 = c1.getValue();
        int num2 = c2.getValue();
        return num1 > num2 ?  PLAYER_1_WIN
        : ((num1 == num2) ? EQUAL : PLAYER_2_WIN);
    }
}
