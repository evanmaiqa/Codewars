import org.testng.Assert;
import org.testng.annotations.Test;

public class IsThisATriangleTest {
    // https://www.codewars.com/kata/56606694ec01347ce800001b
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

    @Test
    public void publicTests() {
        Assert.assertEquals(isTriangle(1, 2, 2), true);
        Assert.assertEquals(isTriangle(7, 2, 2), false);
    }
}
