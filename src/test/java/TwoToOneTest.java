import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoToOneTest {
    // https://www.codewars.com/kata/5656b6906de340bd1b0000ac
    public static String longest (String s1, String s2) {
        String[] arr = s1.concat(s2).split("");
        Arrays.sort(arr);
        s1 = "";
        for(String s : arr){
            if(!s1.contains(s)) {
                s1 += s;
            }
        }
        return s1;
    }
    @Test
    public void test1() {
        Assert.assertEquals(longest("aretheyhere", "yestheyarehere"), "aehrsty");
    }
    @Test
    public void test2() {
        Assert.assertEquals(longest("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu");
    }
    @Test
    public void test3() {
        Assert.assertEquals(longest("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy");
    }
}
