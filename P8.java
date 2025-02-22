import java.util.*;

class P8 {
    static String replaceSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "This   is   an  example    with  multiple   spaces.";
        System.out.println(replaceSpaces(text));
    }
}
