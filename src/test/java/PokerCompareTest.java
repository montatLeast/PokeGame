import org.junit.Assert;
import org.junit.Test;

public class PokerCompareTest {

    @Test
    public void should_return_player_2_win_when_input_two_card_and_high_card(){
        Card card_2H = new Card(2,"H");
        Card card_3H = new Card(3,"H");
        PokerCompare pokeCompare = new PokerCompare();
        String result = pokeCompare.compare(card_2H, card_3H);
        Assert.assertEquals("Player 2 Win", result);
    }

    @Test
    public void should_return_equal_when_input_two_card_equal(){
        Card card_2H = new Card(2,"H");
        Card card_2C = new Card(2,"C");
        PokerCompare pokeCompare = new PokerCompare();
        String result = pokeCompare.compare(card_2H,card_2C);
        Assert.assertEquals("equal", result);
    }

    @Test
    public void should_return_player_1_win_when_every_input_double_cards_and_high_card(){
        String cardGroup1 = "3H 4H";
        String cardGroup2 = "2C 4C";
    }

}
