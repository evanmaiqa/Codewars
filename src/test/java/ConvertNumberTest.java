import java.util.Arrays;

public class ConvertNumberTest {
    // https://www.codewars.com/kata/5583090cbe83f4fd8c000051
    public static int[] digitize(long n) {
        String[] arr = Long.toString(n).split("");
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[arr.length - i - 1]);
        }
        return arrInt;
    }
}
