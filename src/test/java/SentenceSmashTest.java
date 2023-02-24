public class SentenceSmashTest {
    // https://www.codewars.com/kata/53dc23c68a0c93699800041d
    public static String smash(String... words) {
//        StringBuilder sb = new StringBuilder();
//        for(String str : words) {
//            sb.append(str + " ");
//        }
//        return sb.toString().trim();
        return String.join(" ", words);
    }
}
