import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeUpperCaseTest {
    // https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7
    public static String makeUpperCase(String str){
        return str.toUpperCase();
    }
    @Test
    public void test1()
    {
        Assert.assertEquals(makeUpperCase("hello"), "HELLO");
    }
}
