
import java.util.regex.*;
import java.util.*;

class P5 {
    static void extractCaps(String text) {
        Pattern p = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extractCaps(text);
    }
}



