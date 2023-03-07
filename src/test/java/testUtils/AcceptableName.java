package testUtils;

public class AcceptableName {
    private static String title(String name) {
        StringBuilder sb = new StringBuilder();
        String[] arr = name.split(" ");
        for (String str : arr) {
            sb.append(str.substring(0,1).toUpperCase());
            sb.append(str.substring(1));
        }
        return sb.append("Test").toString();
    }

    public static void main(String[] args) {
        System.out.println(title("Regex validate PIN code"));
    }
}
