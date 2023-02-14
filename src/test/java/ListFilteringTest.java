import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListFilteringTest {
    // https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listReturn= new ArrayList<>();
        for (Object i : list) {
            if(i.getClass().getSimpleName().equals("Integer")){
                listReturn.add(i);
            }
        }
        return listReturn;
    }

    @Test
    public void testList1() {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("b");
        List<Object> listExpected = new ArrayList<>();
        listExpected.add(1);
        listExpected.add(2);
        Assert.assertEquals(filterList(list), listExpected);
    }
}
