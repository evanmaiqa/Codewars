import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class SimplePigLatinTest {
    // https://www.codewars.com/kata/520b9d2ad5c005041100000f
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        for(String i : str.split(" ")) {
            if(!Pattern.matches("[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", i)) {
                sb.append(i.substring(1)).append(i.substring(0,1)).append("ay ");
            } else {
                sb.append(i);
            }

        }
        return sb.toString().trim();
    }

    @Test
    public void FixedTests() {
        Assert.assertEquals(pigIt("Pig latin is cool"), "igPay atinlay siay oolcay");
    }

    @Test
    public void FixedTests1() {
        Assert.assertEquals(pigIt("This is my string"), "hisTay siay ymay tringsay");
    }
    @Test
    public void FixedTests2() {
        Assert.assertEquals(pigIt("tora o mores !"), "oratay oay oresmay !");
    }
}
