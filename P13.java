import java.util.regex.*;
import java.util.*;

 class P13 {
    static void extractCurrency(String text) {
        Pattern p = Pattern.compile("\\$?\\d+\\.\\d{2}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        extractCurrency(text);
    }
}
