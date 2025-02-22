
import java.util.regex.*;

class P11 {
    static boolean isValidCard(String card) {
        String regex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";
        return Pattern.matches(regex, card);
    }

    public static void main(String[] args) {
        String[] testCards = { "4111111111111111", "5500000000000004", "1234567812345678", "4999999999999999", "5012345678901234" };

        for (String card : testCards) {
            System.out.println(card + " -> " + (isValidCard(card) ? "Valid" : "Invalid"));
        }
    }
}

