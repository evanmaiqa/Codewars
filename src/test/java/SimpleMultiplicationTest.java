import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleMultiplicationTest {
    // https://www.codewars.com/kata/583710ccaa6717322c000105/java
    public static int simpleMultiplication(int n) {
        return ((n & 1) == 0) ? n * 8 : n * 9;
    }

    @Test
    public void test1() {
        Assert.assertEquals(simpleMultiplication(1), 9);
    }
    @Test
    public void test2() {
        Assert.assertEquals(simpleMultiplication(3), 27);
    }
    @Test
    public void test3() {
        Assert.assertEquals(simpleMultiplication(2), 16);
    }
}
