import org.testng.Assert;
import org.testng.annotations.Test;

public class FindNextPerfectSquareTest {
    // https://www.codewars.com/kata/56269eb78ad2e4ced1000013
    public static long findNextSquare(long sq) {
        return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow((Math.sqrt(sq) + 1), 2) : (long) -1;
    }

    @Test
    public void test1() {
        Assert.assertEquals(findNextSquare(121), 144);
    }

    @Test
    public void test2() {
        Assert.assertEquals(findNextSquare(625), 676);
    }

    @Test
    public void test3() {
        Assert.assertEquals(findNextSquare(114), -1);
    }
}
