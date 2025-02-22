
import java.util.regex.*;
import java.util.*;

class P12 {
    static void extractLangs(String text) {
        Pattern p = Pattern.compile("\\b(JavaScript|Java|Python|C\\+\\+|C#|C|Go|Ruby|Swift|Kotlin|PHP|Rust)\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extractLangs(text);
    }
}

