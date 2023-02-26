import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class GetMeanOfArrayTest {
    // https://www.codewars.com/kata/563e320cee5dddcf77000158
    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum()/marks.length;
    }
    @Test
    public void simpleTest1() {
        Assert.assertEquals(getAverage(new int[] {2,2,2,2}), 2);
    }
    @Test
    public void simpleTest2() {
        Assert.assertEquals(getAverage(new int[] {1,2,3,4,5}), 3);
    }
    @Test
    public void simpleTest3() {
        Assert.assertEquals(getAverage(new int[] {1,1,1,1,1,1,1,2}), 1);
    }
}
