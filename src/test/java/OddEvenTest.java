import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddEvenTest {
    // https://www.codewars.com/kata/5949481f86420f59480000e7
    public static String oddOrEven(int[] array) {
        return (Arrays.stream(array).sum() & 1) == 1 ? "odd" : "even";
    }

    @Test
    public void exampleTest1() {
        Assert.assertEquals(oddOrEven(new int[]{2, 5, 34, 6}), "odd");
    }
    @Test
    public void exampleTest2() {
        Assert.assertEquals(oddOrEven(new int[]{}), "even");
    }
    @Test
    public void exampleTest3() {
        Assert.assertEquals(oddOrEven(new int[]{0, -1, -5}), "even");
    }
}
