import org.testng.Assert;
import org.testng.annotations.Test;

public class QuarterYearTest {
    // https://www.codewars.com/kata/5ce9c1000bab0b001134f5af
    public static int quarterOf(int month) {
        return month <= 3 ? 1 : month <= 6 ? 2 : month <= 9 ? 3 : 4;
    }
    @Test
    public void exampleTests() {
        Assert.assertEquals( quarterOf(3), 1);
        Assert.assertEquals( quarterOf(8), 3);
        Assert.assertEquals(quarterOf(11), 4);
    }
}
