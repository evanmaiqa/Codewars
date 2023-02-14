import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listReturn= new ArrayList<>();
        for (Object i : list) {
            if(i.getClass().getSimpleName().equals("Integer")){
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
//        for(int i = 0; i <= 10; i++) {
//            System.out.println(String.format("%d ---> %d", i, (i & 1)));
//        }

//        List<Object> list5 = new ArrayList<>();
//        list5.add(1);
//        list5.add(2);
//        list5.add("a");
//        list5.add("b");
//        List<Object> listReturn= new ArrayList<>();
//        for (int i = 0; i < list5.size(); i++) {
//            if(list5.get(i).getClass().getSimpleName().equals("Integer")){
//                listReturn.add(list5.get(i));
//            }
//        }
//        System.out.println(listReturn);



    }
}
