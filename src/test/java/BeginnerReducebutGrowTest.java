import org.testng.Assert;
import org.testng.annotations.Test;

public class BeginnerReducebutGrowTest {
    // https://www.codewars.com/kata/57f780909f7e8e3183000078/java
    public static int grow(int[] x){
        int multi = 1;
        for(int i : x) {
            multi *= i;
        }
        return multi;
    }

    @Test
    public void testSomething1() {
        Assert.assertEquals(grow(new int[]{1,2,3}),6);
    }
    @Test
    public void testSomething2() {
        Assert.assertEquals(grow(new int[]{4,1,1,1,4}),16);
    }
    @Test
    public void testSomething3() {
        Assert.assertEquals(grow(new int[]{2,2,2,2,2,2}),64);
    }
}
