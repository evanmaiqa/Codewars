import org.testng.Assert;
import org.testng.annotations.Test;

public class ExesandOhsTest {
    // https://www.codewars.com/kata/55908aad6620c066bc00002a
    public static boolean getXO (String str) {
        return str.toLowerCase().replaceAll("o", "").length() ==  str.toLowerCase().replaceAll("x", "").length();
    }

    @Test
    public void testSomething1(){
        Assert.assertTrue(getXO("xxxooo"));
    }
    @Test
    public void testSomething2(){
        Assert.assertTrue(getXO("xxxXooOo"));
    }
    @Test
    public void testSomething3(){
        Assert.assertFalse(getXO("xxx23424esdsfvxXXOOooo"));
    }
    @Test
    public void testSomething4(){
        Assert.assertFalse(getXO("xXxxoewrcoOoo"));
    }
    @Test
    public void testSomething5(){
        Assert.assertFalse(getXO("XxxxooO"));
    }

}
