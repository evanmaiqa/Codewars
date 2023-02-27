import org.testng.Assert;
import org.testng.annotations.Test;

public class RockPaperScissorsTest {
    // https://www.codewars.com/kata/5672a98bdbdd995fad00000f
    public static String rps(String p1, String p2) {
        if(p1.equals(p2)) {
            return "Draw!";
        } else if ((p1.equals("scissors") && p2.equals("paper")) || p1.equals("rock") && p2.equals("scissors") || p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        Assert.assertEquals(rps("rock", "scissors"), "Player 1 won!");
        Assert.assertEquals(rps("scissors", "paper"), "Player 1 won!");
        Assert.assertEquals(rps("paper", "rock"), "Player 1 won!");
    }
}
