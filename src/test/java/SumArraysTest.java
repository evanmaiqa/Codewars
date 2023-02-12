import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArraysTest {
    //https://www.codewars.com/kata/53dc54212259ed3d4f00071c/java
    public static double sum(double[] numbers) {
        double num = 0;
        for(double i : numbers) {
            num += i;
        }
        return num;
    }

    @Test
    public void TestSum1() {
        Assert.assertEquals(sum(new double[]{1, 5.2, 4, 0, -1}), 9.2);
    }
    @Test
    public void TestSum2() {
        Assert.assertEquals(sum(new double[]{}), 0);
    }
    @Test
    public void TestSum3() {
        Assert.assertEquals(sum(new double[]{-2.398}), -2.398);
    }
}
