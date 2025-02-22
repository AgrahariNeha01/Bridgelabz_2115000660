
import java.util.*;

class P9 {
    static String censorWords(String text, List<String> badWords) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        System.out.println(censorWords(text, badWords));
    }
}



