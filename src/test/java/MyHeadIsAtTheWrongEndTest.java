import org.testng.Assert;
import org.testng.annotations.Test;

public class MyHeadIsAtTheWrongEndTest {
    // https://www.codewars.com/kata/56f699cd9400f5b7d8000b55
    public static String[] fixTheMeerkat(String[] arr) {
        return new String[]{arr[2], arr[1], arr[0]};
    }
    @Test
    public void exampleTest1(){
        Assert.assertEquals(fixTheMeerkat(new String[]{ "tail", "body", "head" }), new String[]{ "head", "body", "tail" });
    }
    @Test
    public void exampleTest2(){
        Assert.assertEquals(fixTheMeerkat(new String[]{ "tails", "body", "heads" }), new String[]{ "heads", "body", "tails" });
    }
    @Test
    public void exampleTest3(){
        Assert.assertEquals(fixTheMeerkat(new String[]{ "bottom", "middle", "top" }), new String[]{ "top", "middle", "bottom" });
    }
    @Test
    public void exampleTest4(){
        Assert.assertEquals(fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }), new String[]{ "upper legs", "torso", "lower legs" });
    }
}
