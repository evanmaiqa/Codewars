import org.testng.Assert;
import org.testng.annotations.Test;

public class GrowthPopulationTest {
    // https://www.codewars.com/kata/563b662a59afc2b5120000c6
    public static int nbYear(int p0, double percent, int aug, int p) {
        int j = 0;
        while (p0 < p) {
            p0 += (int) (p0 * (percent / 100)) + aug;
            j++;
        }
        return j;
    }

    @Test
    public void test1() {
        Assert.assertEquals(nbYear(1500, 5, 100, 5000), 15);
        Assert.assertEquals(nbYear(1500000, 2.5, 10000, 2000000), 10);
        Assert.assertEquals(nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
