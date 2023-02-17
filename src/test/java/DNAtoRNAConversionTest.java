import org.testng.Assert;
import org.testng.annotations.Test;

public class DNAtoRNAConversionTest {
    // https://www.codewars.com/kata/5556282156230d0e5e000089
    public static String naToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
    @Test
    public void testDna1() {
        Assert.assertEquals(naToRna("TTTT"), "UUUU");
    }
    @Test
    public void testDna2() {
        Assert.assertEquals(naToRna("GCAT"), "GCAU");
    }
}
