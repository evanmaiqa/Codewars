import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listReturn = new ArrayList<>();
        for (Object i : list) {
            if (i.getClass().getSimpleName().equals("Integer")) {
                listReturn.add(i);
            }
        }
        return listReturn;
    }

    public static void main(String[] args) {
//        String str = "Hello world";
//        List<String> list = Arrays.asList(str.split(" "));
//        Collections.reverse(list);
//        System.out.println(String.join("-", list));
//



    }
}
