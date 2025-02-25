import com.opencsv.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class P8 {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/resources/employees.csv";
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phonePattern = "^[0-9]{10}$";

        Pattern emailRegex = Pattern.compile(emailPattern);
        Pattern phoneRegex = Pattern.compile(phonePattern);

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] line;
            while ((line = reader.readNext()) != null) {
                Matcher emailMatcher = emailRegex.matcher(line[2]);
                Matcher phoneMatcher = phoneRegex.matcher(line[3]);

                if (!emailMatcher.matches() || !phoneMatcher.matches()) {
                    System.out.println("Invalid row: " + Arrays.toString(line));
                }
            }
        }
    }
}
