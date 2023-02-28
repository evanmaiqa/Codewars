import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SumMixedArrayTest {
    // https://www.codewars.com/kata/57eaeb9578748ff92a000009
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object obj : mixed) {
            sum += Integer.parseInt(obj.toString());
        }
        return sum;
    }

    @Test
    public void test_1() {
        Assert.assertEquals(sum(Arrays.asList(5, "5")), 10);
    }

    @Test
    public void test_2() {
        Assert.assertEquals(sum(Arrays.asList(9, 3, "7", "3")), 22);
    }

    @Test
    public void test_3() {
        Assert.assertEquals(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)), 42);
    }

    @Test
    public void test_4() {
        Assert.assertEquals(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")), 41);
    }
}
