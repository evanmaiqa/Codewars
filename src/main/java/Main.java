import java.util.*;

public class Main {


    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        System.out.println(s.length() - s.replace("е", "").length());

        String str = "Перестановочный алгоритм быстрого действия", str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'о') {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);

        String str3 = "Посмотрите как Рите нравится ритм";
        int index = str3.toLowerCase().indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = str3.toLowerCase().indexOf("рит", index + 1);
        }

        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        int sum = 0;
        for (String[] arr : array) {
            for (String strArr : arr) {
                if(!strArr.contains("е")) {
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
}
