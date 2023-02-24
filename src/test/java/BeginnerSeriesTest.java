import org.testng.Assert;
import org.testng.annotations.Test;

public class BeginnerSeriesTest {
    // https://www.codewars.com/kata/55f2b110f61eb01779000053
    public int getSum(int a, int b) {
        int c = 0;
        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            c += i;
        }
        return c;
    }

    @Test
    public void SumTest1() {
        Assert.assertEquals(getSum(-1, 0), -1);
    }

    @Test
    public void SumTest2() {
        Assert.assertEquals(getSum(0, 1), 1);
    }

    @Test
    public void SumTest3() {
        Assert.assertEquals(getSum(-1, 2), 2);
    }
}
