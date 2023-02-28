import org.testng.Assert;
import org.testng.annotations.Test;

public class StopgninnipsMysdroWTest {
    // https://www.codewars.com/kata/5264d2b162488dc400000001
//    public String spinWords(String sentence) {
//        String[] arr = sentence.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].length() >= 5) {
//                arr[i] = new StringBuilder(arr[i]).reverse().toString();
//            }
//        }
//        return String.join(" ", arr);
//        }
    public String spinWords(String sentence) {
        for(String str : sentence.split(" ")){
            if(str.length() > 4) {
                sentence = sentence.replace(str, new StringBuilder(str).reverse().toString());
            }
        }
        return sentence;
    }

        @Test
        public void test1 () {
            Assert.assertEquals(spinWords("Welcome"), "emocleW");
        }

        @Test
        public void test2 () {
            Assert.assertEquals(spinWords("Hey fellow warriors"), "Hey wollef sroirraw");
        }
    }
