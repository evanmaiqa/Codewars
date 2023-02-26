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
        System.out.println(maskify("4556364607935616"));

        int[] arrInt = new int[]{1,2,3};
        int num = Arrays.stream(arrInt).sum();
        System.out.println("Arrays.stream(arrInt).sum() is " + num);
        System.out.println(Math.abs(10));

    }
    public static String maskify(String str) {
        return  str.substring(0, str.length() - 4).replaceAll("[A-Z\\d]","#") + str.substring( str.length() - 4);
    }
}
