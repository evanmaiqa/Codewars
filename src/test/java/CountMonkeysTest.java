public class CountMonkeysTest {
    // https://www.codewars.com/kata/56f69d9f9400f508fb000ba7
    public static int[] monkeyCount(final int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] += i +1;
        }
        return arr;
        // return IntStream.rangeClosed(1, n).toArray();
    }
}
