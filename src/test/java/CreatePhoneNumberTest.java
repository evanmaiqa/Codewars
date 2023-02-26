import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePhoneNumberTest {
    // https://www.codewars.com/kata/525f50e3b73515a6db000b83
    public static String createPhoneNumber(int[] numbers) {
        return "("+numbers[0]+numbers[1]+numbers[2]+") "+numbers[3]+numbers[4]+numbers[5]+"-"+numbers[6]+numbers[7]+numbers[8]+numbers[9];
    }

    @Test
    public void tests() {
        Assert.assertEquals(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }
}
