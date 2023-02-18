import org.testng.Assert;
import org.testng.annotations.Test;

public class JadenCasingStringsTest {
    // https://www.codewars.com/kata/5390bac347d09b7da40006f6
    public String toJadenCase(String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for(String str : phrase.split(" ")) {
                str = str.substring(0, 1).toUpperCase() + str.substring(1);
                sb.append(str + " ");
            }
            return sb.toString().trim();
        }
        return null;
    }
    @Test
    public void test1() {
        Assert.assertNull(toJadenCase(null), null);
    }
    @Test
    public void test2() {
        Assert.assertNull(toJadenCase(""), null);
    }
    @Test
    public void test3() {
        Assert.assertEquals(toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }
}
