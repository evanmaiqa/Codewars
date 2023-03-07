package notSolved;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayDiffTest {
    //https://www.codewars.com/kata/523f5d21c841566fde000009
    public static int[] arrayDiff(int[] a, int[] b) {
//        if(b.length == 0) {return a;};
//        String str = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "").replace(b[0] + "", "");
//        System.out.println(str);
//        int arr[] = new int[str.length()];
//        for(int i = 0; i < str.length();i++) {
//            arr[i] = (int)str.charAt(i) - '0';
//        }
//        return arr;
        return a;
    }

    @Test
    public void sampleTests() {
        Assert.assertEquals(arrayDiff(new int[]{1, 2}, new int[]{1}), new int[]{2});
        Assert.assertEquals(arrayDiff(new int[]{1, 2, 2}, new int[]{1}), new int[]{2, 2});
        Assert.assertEquals(arrayDiff(new int[]{1, 2, 2}, new int[]{2}), new int[]{1});
        Assert.assertEquals(arrayDiff(new int[]{1, 2, 2}, new int[]{}), new int[]{1, 2, 2});
        Assert.assertEquals(arrayDiff(new int[]{}, new int[]{1, 2}), new int[]{});
    }
}