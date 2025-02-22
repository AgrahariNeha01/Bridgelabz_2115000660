
import java.util.regex.*;
import java.util.*;

class P4 {
    static void extractEmails(String text) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org. Also reach out at help123@service.net!";
        extractEmails(text);
    }
}







