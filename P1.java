
import java.util.regex.*;

class P1 {
    static boolean isValidUsername(String u) {
        return u.matches("[a-zA-Z][a-zA-Z0-9_]{4,14}");
    }

    public static void main(String[] args) {
        String[] testCases = {"user_123", "123user", "us", "Valid_Name", "Name123"};

        for (String u : testCases) {
            System.out.println(u + " -> " + (isValidUsername(u) ? "Valid" : "Invalid"));
        }
    }
}



