
import java.util.regex.*;
import java.util.*;

class P6 {
    static void extractDates(String text) {
        Pattern p = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher m = p.matcher(text);
        List<String> dates = new ArrayList<>();

        while (m.find()) {
            dates.add(m.group());
        }

        System.out.println(String.join(", ", dates));
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extractDates(text);
    }
}



