
import java.util.regex.*;

class P3 {
    static boolean isValidHex(String h) {
        return h.matches("#[a-fA-F0-9]{6}");
    }

    public static void main(String[] args) {
        String[] testCases = {"#FFA500", "#ff4500", "#123", "#ABCDEF", "#1a2b3c", "123456"};

        for (String h : testCases) {
            System.out.println(h + " -> " + (isValidHex(h) ? "Valid" : "Invalid"));
        }
    }
}





