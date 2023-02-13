import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateBMITest {
    // https://www.codewars.com/kata/57a429e253ba3381850000fb
    public static String bmi(double weight, double height) {
        double bmi = weight/(height*height);
        if(bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        }
        return "Obese";
    }
    @Test
    public void testBMI1() {
        Assert.assertEquals(bmi(80, 1.80), "Normal");
    }
}
