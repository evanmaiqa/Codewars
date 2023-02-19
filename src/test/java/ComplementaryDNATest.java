import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplementaryDNATest {
    // https://www.codewars.com/kata/554e4a2f232cdd87d9000038
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder(dna);
        for(int i = 0; i < dna.length(); i++) {
            if(sb.charAt(i) == 'A') {
                sb.setCharAt(i, 'T');
            } else if (sb.charAt(i) == 'T') {
                sb.setCharAt(i, 'A');
            } else if(sb.charAt(i) == 'C') {
                sb.setCharAt(i, 'G');
            } else if(sb.charAt(i) == 'G') {
                sb.setCharAt(i, 'C');
            }
        }
        return sb.toString();
    }
    @Test
    public void test1() {
        Assert.assertEquals(makeComplement("AAAA"), "TTTT");
    }
    @Test
    public void test2() {
        Assert.assertEquals(makeComplement("ATTGC"), "TAACG");
    }
    @Test
    public void test3() {
        Assert.assertEquals(makeComplement("GTAT"), "CATA");
    }
}
