import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversedWordsTest {
    public static String reverseWords(String str){
        String[] arr = str.split(" ");
        String str2 = "";
        for(int i = 0; i< arr.length; i++) {
            str2 += arr[arr.length - i - 1] + " ";
        }
        return str2.trim();
    }

    @Test
    public void sampleTest1() {
        Assert.assertEquals(reverseWords("The greatest victory is that which requires no battle"), "battle no requires which that is victory greatest The");
    }
    @Test
    public void sampleTest2() {
        Assert.assertEquals(reverseWords("yoda doesn't speak like this"), "this like speak doesn't yoda");
    }
    @Test
    public void sampleTest3() {
        Assert.assertEquals(reverseWords("row row row your boat"), "boat your row row row");
    }

}
