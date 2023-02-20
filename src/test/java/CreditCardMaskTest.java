
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditCardMaskTest {
    // https://www.codewars.com/kata/5412509bd436bd33920011bc
    // https://www.jrebel.com/blog/java-regular-expressions-cheat-sheet
    public static String maskify(String str) {
//        if(str.length() > 4) {
//            return str.substring(0, str.length() - 4).replaceAll("[\\w]","#") + str.substring( str.length() - 4);
//        }
//        return str;
        return str.replaceAll(".(?=.{4})", "#");
    }

    @Test
    public void testSolution1() {
        Assert.assertEquals(maskify("4556364607935616"), "############5616");
    }

    @Test
    public void testSolution2() {
        Assert.assertEquals(maskify("64607935616"), "#######5616");
    }

    @Test
    public void testSolution3() {
        Assert.assertEquals(maskify("1"), "1");
    }

    @Test
    public void testSolution4() {
        Assert.assertEquals(maskify(""), "");
    }

    @Test
    public void testSolution5() {
        Assert.assertEquals(maskify("Skippy"), "##ippy");
    }

    @Test
    public void testSolution6() {
        Assert.assertEquals(maskify("NanananananananananananananananaBatman!"), "###################################man!");
    }
}
