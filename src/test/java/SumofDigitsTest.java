import org.testng.annotations.*;
import  org.testng.*;

public class SumofDigitsTest {
    // https://www.codewars.com/kata/541c8630095125aba6000c00
    public static int digital_root(int n) {
        int sum;
        do {
            sum = 0;
            for (String i : String.valueOf(n).split("")) {
                sum += Integer.parseInt(i);
                n = sum;
            }
        } while (sum > 9);

        return sum;
    }
    @Test
    public void Test1() {
        Assert.assertEquals(digital_root(16), 7);
    }
    @Test
    public void Test2() {
        Assert.assertEquals(digital_root(465), 6);
    }
}
