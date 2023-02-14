import org.testng.Assert;
import org.testng.annotations.Test;

public class WillYouMakeItTest {
    // https://www.codewars.com/kata/5861d28f124b35723e00005e
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump/mpg <= fuelLeft;
    }

    @Test
    public static void test1() {
        Assert.assertFalse(zeroFuel(100, 50, 1));
    }
    @Test
    public static void test2() {
        Assert.assertTrue(zeroFuel(50, 25, 2));
    }
}
