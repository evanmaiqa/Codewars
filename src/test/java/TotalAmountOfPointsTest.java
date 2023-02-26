import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalAmountOfPointsTest {
    // https://www.codewars.com/kata/5bb904724c47249b10000131
    public static int points(String[] games) {
        int point = 0;
        for(String str : games){
            if((str.charAt(0) - '0') > (str.charAt(2) - '0')) {
                point += 3;
            } else if ((str.charAt(0) - '0') == (str.charAt(2) - '0')) {
                point ++;
            }
        }
        return point;
    }

    @Test
    public void basicTest1() {
        Assert.assertEquals(points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}), 30);
    }

    @Test
    public void basicTest2() {
        Assert.assertEquals(points(new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}), 10);
    }
}
