package repeat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersistentBuggerTest {
    // https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java
    public static int persistence(long n) {
        return 0;
    }

    @Test
    public void BasicTests() {
        Assert.assertEquals(persistence(39), 3);
        Assert.assertEquals(persistence(4), 0);
        Assert.assertEquals(persistence(25), 2);
        Assert.assertEquals(persistence(999), 4);
    }
}
