import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> Set = new HashSet<String>();

        // Adding Elements
        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Set.add("five");
        Set.add("one");

        // Set follows unordered way.
        System.out.println(Set);
        }
}
