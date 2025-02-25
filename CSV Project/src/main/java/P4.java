import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class P4 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            reader.readNext();
            while ((line = reader.readNext()) != null) {
                int marks = Integer.parseInt(line[2]);
                if (marks > 80) {
                    System.out.println(line[0] + ", " + line[1] + ", " + marks);
                }
            }
        } catch (IOException | CsvValidationException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
