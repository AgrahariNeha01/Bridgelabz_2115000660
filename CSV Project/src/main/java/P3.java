import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class P3 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv";
        int count = -1;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            while (true) {
                try {
                    if (reader.readNext() == null) break;
                    count++;
                } catch (CsvValidationException e) {
                    System.out.println("CSV Validation Error: " + e.getMessage());
                }
            }
            System.out.println("Total records: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
