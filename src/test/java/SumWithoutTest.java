import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SumWithoutTest {
    // https://www.codewars.com/kata/576b93db1129fcf2200001e6
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
            int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
        // return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
    }

    @Test
    public void BasicTests() {
        Assert.assertEquals(sum(new int[]{6, 2, 1, 8, 10}), 16);
    }

    @Test
    public void BasicTests1() {
        Assert.assertEquals(sum(new int[]{1, 1, 11, 2, 3}), 6);
    }
}
