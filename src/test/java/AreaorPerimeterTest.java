import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaorPerimeterTest {
    // https://www.codewars.com/kata/5ab6538b379d20ad880000ab
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : l * 2 + w * 2;
    }
    @Test
    public void testSomething1() {
        Assert.assertEquals(areaOrPerimeter(4 , 4), 16);
    }
    @Test
    public void testSomething2() {
        Assert.assertEquals(areaOrPerimeter(6 , 10), 32);
    }
}
