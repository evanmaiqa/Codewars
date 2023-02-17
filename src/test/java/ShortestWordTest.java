import org.testng.Assert;
import org.testng.annotations.Test;

public class ShortestWordTest {
    // https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
//        public static int findShort(String s) {
//        String[] arr = s.split(" ");
//        int shortWord = arr[0].length();
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i].length() < shortWord) {
//                shortWord = arr[i].length();
//            }
//        }
//        return shortWord;
//    }

    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int shortWord = arr[0].length();
        for(String str : arr) {
            if(str.length() < shortWord) {
                shortWord = str.length();
            }
        }
        return shortWord;
    }

    @Test
    public void findShortTest1(){
        Assert.assertEquals(findShort("bitcoin take over the world maybe who knows perhaps"), 3);
    }
    @Test
    public void findShortTest2(){
        Assert.assertEquals(findShort("turns out random test cases are easier than writing out basic ones"), 3);
    }
    @Test
    public void findShortTest3(){
        Assert.assertEquals(findShort("Let's travel abroad shall we"), 2);
    }
}
