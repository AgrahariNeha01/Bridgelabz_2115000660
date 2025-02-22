import java.util.regex.*;

class P2 {
    static boolean isValidPlate(String p) {
        return p.matches("[A-Z]{2}\\d{4}");
    }

    public static void main(String[] args) {
        String[] testCases = {"AB1234", "A12345", "XY9876", "abc123", "ZZ0000"};

        for (String p : testCases) {
            System.out.println(p + " -> " + (isValidPlate(p) ? "Valid" : "Invalid"));
        }
    }
}
