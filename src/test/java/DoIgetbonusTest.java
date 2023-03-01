public class DoIgetbonusTest {
    //https://www.codewars.com/kata/56f6ad906b88de513f000d96
    public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? salary * 10 : salary);
    }
}
