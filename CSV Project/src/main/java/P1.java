import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] row;
            while ((row = reader.readNext()) != null) {
                System.out.println("ID: " + row[0] + ", Name: " + row[1] + ", Age: " + row[2] + ", Marks: " + row[3]);
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
