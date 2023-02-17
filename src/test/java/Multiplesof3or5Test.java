import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplesof3or5Test {
    // https://www.codewars.com/kata/514b92a657cdc65150000006
    public int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    @Test
    public void test1() {
        Assert.assertEquals(solution(10), 23);
    }
}
