import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "Hello world";
        List<String> list = Arrays.asList(str.split(" "));
        Collections.reverse(list);
        System.out.println(String.join("-", list));

    }
}
