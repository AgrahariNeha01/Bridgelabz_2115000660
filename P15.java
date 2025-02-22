
import java.util.regex.*;

class P15 {
    static boolean isValidSSN(String ssn) {
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    public static void main(String[] args) {
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321", "12-345-6789"};

        for (String ssn : ssns) {
            if (isValidSSN(ssn)) {
                System.out.println("? \"" + ssn + "\" is valid");
            } else {
                System.out.println("? \"" + ssn + "\" is invalid");
            }
        }
    }
}





