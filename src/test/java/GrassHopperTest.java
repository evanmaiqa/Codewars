import org.testng.Assert;
import org.testng.annotations.Test;

public class GrassHopperTest {
    // https://www.codewars.com/kata/55cbd4ba903825f7970000f5
    public static char getGrade(int s1, int s2, int s3) {
        int score = s1 + s2 + s3 / 3;
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';

        } else if (score >= 70) {
            return 'C';

        } else if (score >= 60) {
            return 'D';
        }
        return 'F';
    }
    @Test
    public void test1() {
        Assert.assertEquals(getGrade(95,90,93), 'A');
    }

}
