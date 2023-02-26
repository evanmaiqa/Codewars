import org.testng.Assert;
import org.testng.annotations.Test;

public class CountByXTest {
    // https://www.codewars.com/kata/5513795bd3fafb56c200049e
    public static int[] countBy(int x, int n){
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++) {
            arr[i-1] = i*x;
        }
        return arr;
    }

    @Test
    public void fixedTests1(){
        Assert.assertEquals(countBy(1,10), new int[] {1,2,3,4,5,6,7,8,9,10});
    }
    @Test
    public void fixedTests2(){
        Assert.assertEquals(countBy(2,5), new int[] {2,4,6,8,10});
    }
    @Test
    public void fixedTests3(){
        Assert.assertEquals(countBy(3,7), new int[] {3,6,9,12,15,18,21});
    }
    @Test
    public void fixedTests4(){
        Assert.assertEquals(countBy(50,5), new int[] {50,100,150,200,250});
    }
    @Test
    public void fixedTests5(){
        Assert.assertEquals(countBy(100,6), new int[] {100,200,300,400,500,600});
    }
}
