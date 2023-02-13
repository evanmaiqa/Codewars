import org.testng.Assert;
import org.testng.annotations.Test;

public class YoureSquareTest {
    //https://www.codewars.com/kata/54c27a33fb7da0db0100040e
    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }

    @Test
    public void test1() {
        Assert.assertFalse(isSquare(-1));
    }

    @Test
    public void test2() {
        Assert.assertTrue(isSquare(0));
    }

    @Test
    public void test3() {
        Assert.assertFalse(isSquare(3));
    }

    @Test
    public void test4() {
        Assert.assertTrue(isSquare(4));
    }

    @Test
    public void test5() {
        Assert.assertTrue(isSquare(25));
    }

    @Test
    public void test6() {
        Assert.assertFalse(isSquare(26));
    }
}
