import org.testng.Assert;
import org.testng.annotations.Test;

public class TransportationVacationTest {
    // https://www.codewars.com/kata/568d0dd208ee69389d000016
    public static int rentalCarCost(int d) {
        return d < 3 ? 40 * d : d < 7 ? 40 * d - 20 : 40 * d - 50;
    }

    @Test
    public void under3Tests() {
        Assert.assertEquals(rentalCarCost(1), 40);
    }
}
