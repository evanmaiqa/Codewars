import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<?> mixed = Arrays.asList(9, 3, "7", "3");
        int sum = 0;
        for (Object obj : mixed) {
            System.out.println(obj);
            sum += Integer.parseInt(obj.toString());
        }
        System.out.println(sum);
    }
}
