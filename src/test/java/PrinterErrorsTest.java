import org.testng.Assert;
import org.testng.annotations.Test;

public class PrinterErrorsTest {
    // https://www.codewars.com/kata/56541980fa08ab47a0000040
    public static String printerError(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 109) {
                num++;
            }
        }
        return num + "/" + s.length();
    }

    @Test
    public void test() {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        Assert.assertEquals(printerError(s), "3/56");
    }
}
