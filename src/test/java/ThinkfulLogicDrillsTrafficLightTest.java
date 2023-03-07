public class ThinkfulLogicDrillsTrafficLightTest {
    // https://www.codewars.com/kata/58649884a1659ed6cb000072
    public static String updateLight(String current) {
        return current.equals("red") ? "green" : current.equals("green") ? "yellow" : "red";
    }
}
