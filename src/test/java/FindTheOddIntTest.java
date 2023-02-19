import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTheOddIntTest {
    // https://www.codewars.com/kata/54da5a58ea159efa38000836
    public static int findIt(int[] a) {
        int k = 0;
        for (int i : a) {
            k = 0;
            for (int j : a) {
                if(j == i) {
                    k++;
                }
            }
            if((k & 1) == 1) {
                return i;
            }
        }
        return a[k];
    }
    @Test
    public void findTest1() {
        Assert.assertEquals(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}) , 5);
    }
    @Test
    public void findTest2() {
        Assert.assertEquals(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}) , -1);
    }
    @Test
    public void findTest3() {
        Assert.assertEquals(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}) , 5);
    }
    @Test
    public void findTest4() {
        Assert.assertEquals(findIt(new int[]{10}) , 10);
    }
    @Test
    public void findTest5() {
        Assert.assertEquals(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}) , 10);
    }
    @Test
    public void findTest6() {
        Assert.assertEquals(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}) , 1);
    }
}
