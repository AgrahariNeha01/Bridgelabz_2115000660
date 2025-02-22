import java.util.regex.*;
import java.util.*;

class P14 {
    static void findRepeatingWords(String text) {
        Pattern p = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        Set<String> repeatedWords = new HashSet<>();

        while (m.find()) {
            repeatedWords.add(m.group(1));
        }

        for (String word : repeatedWords) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        findRepeatingWords(text);
    }
}