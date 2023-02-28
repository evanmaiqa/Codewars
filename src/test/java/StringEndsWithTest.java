public class StringEndsWithTest {
    // https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
    public static boolean solution(String str, String ending) {
        return str.length() < ending.length() ? false : str.substring(str.length() - ending.length()).equals(ending);
    }
}
