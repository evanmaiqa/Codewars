import org.testng.Assert;
import org.testng.annotations.Test;

public class WhoLikesItTest {
    // https://www.codewars.com/kata/5266876b8f4bf2da9b000362
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return String.format("%s likes this", names[0]);
        } else if (names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        } else if (names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        }
        return String.format("%s, %s and %s others like this", names[0], names[1], names.length - 2);
    }

    @Test
    public void staticTests() {
        Assert.assertEquals(whoLikesIt(), "no one likes this");
        Assert.assertEquals(whoLikesIt("Peter"), "Peter likes this");
        Assert.assertEquals(whoLikesIt("Max", "John", "Mark"), "Max, John and Mark like this");
        Assert.assertEquals(whoLikesIt("Alex", "Jacob", "Mark", "Max"), "Alex, Jacob and 2 others like this");
    }
}
