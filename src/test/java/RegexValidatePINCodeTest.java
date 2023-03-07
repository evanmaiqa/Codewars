import org.testng.Assert;
import org.testng.annotations.Test;

public class RegexValidatePINCodeTest {
    // https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
    public static boolean validatePin(String pin) {
        //return pin.matches("[0-9]+") && (pin.length() == 4 || pin.length() == 6);
        //return pin.matches("[0-9]{4}|[0-9]{6}");
        return pin.matches("\\d{4}|\\d{6}");
    }
    @Test
    public void validPins() {
        Assert.assertEquals(validatePin("1234"),true);
        Assert.assertEquals(validatePin("0000"),true);
        Assert.assertEquals(validatePin("1111"),true);
        Assert.assertEquals(validatePin("123456"),true);
        Assert.assertEquals(validatePin("098765"),true);
        Assert.assertEquals(validatePin("000000"),true);
        Assert.assertEquals(validatePin("090909"),true);
    }

    @Test
    public void nonDigitCharacters() {
        Assert.assertEquals(validatePin("a234"), false);
        Assert.assertEquals(validatePin(".234"), false);
    }

    @Test
    public void invalidLengths() {
        Assert.assertEquals(validatePin("1"), false);
        Assert.assertEquals(validatePin("12"), false);
        Assert.assertEquals(validatePin("123"), false);
        Assert.assertEquals(validatePin("12345"), false);
        Assert.assertEquals(validatePin("1234567"), false);
        Assert.assertEquals(validatePin("-1234"), false);
        Assert.assertEquals(validatePin("1.234"), false);
        Assert.assertEquals(validatePin("00000000"), false);
    }
}
