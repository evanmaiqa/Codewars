import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FindMaximumandMinimumValuesofaListTest {
    //https://www.codewars.com/kata/577a98a6ae28071780000989
    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }

    @Test
    public void testMin1() {
        Assert.assertEquals(min(new int[]{-52, 56, 30, 29, -54, 0, -110}), -110);
    }

    @Test
    public void testMin2() {
        Assert.assertEquals(min(new int[]{42, 54, 65, 87, 0}), 0);
    }

    @Test
    public void testMax1() {
        Assert.assertEquals(max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}), 566);
    }

    @Test
    public void testMax2() {
        Assert.assertEquals(max(new int[]{5}), 5);
    }
}
