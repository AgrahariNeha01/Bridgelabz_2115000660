import java.util.regex.*;
import java.util.*;

class P7 {
    static void extractLinks(String text) {
        Pattern p = Pattern.compile("\\bhttps?://[\\w.-]+(?:\\.[a-z]{2,})+\\b");
        Matcher m = p.matcher(text);
        List<String> links = new ArrayList<>();

        while (m.find()) {
            links.add(m.group());
        }

        System.out.println(String.join(", ", links));
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        extractLinks(text);
    }
}

