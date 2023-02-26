import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FindTheParityOutlierTest {
    // https://www.codewars.com/kata/5526fc09a1bbd946250002dc
    static int find(int[] integers) {
        int odd = 0, even = 0;
        for(int i : integers) {
            if((i & 1) == 1) { odd++; } else { even++;}
        }
        if (odd < even) {
            for(int i : integers) {
                if((i & 1) == 1) { return i;}
            }
        }
        for(int i : integers) {
            if((i & 1) == 0) { return i;}
        }
        return 0;
    }

    @Test
    public void testExample() {
        Assert.assertEquals(find(new int[]{2, 6, 8, -10, 3}), 3);
    }

    @Test
    public void testExample1() {
        Assert.assertEquals(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}), 206847684);
    }

    @Test
    public void testExample2() {
        Assert.assertEquals(find(new int[]{Integer.MAX_VALUE, 0, 1}), 0);
    }
}
