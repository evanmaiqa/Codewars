import org.testng.Assert;
import org.testng.annotations.Test;

public class L1SetAlarmTest {
    // https://www.codewars.com/kata/568dcc3c7f12767a62000038
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
    @Test
    public void setAlarmTest() {
        Assert.assertTrue(setAlarm(true, false));
        Assert.assertFalse(setAlarm(true, true));
        Assert.assertFalse(setAlarm(false, false));
        Assert.assertFalse(setAlarm(false, true));
    }
}
