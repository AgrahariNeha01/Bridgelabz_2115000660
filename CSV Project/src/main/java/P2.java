import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            writer.writeNext(new String[]{"ID", "Name", "Department", "Salary"});


            writer.writeNext(new String[]{"101", "Amit", "HR", "50000"});
            writer.writeNext(new String[]{"102", "Neha", "IT", "75000"});
            writer.writeNext(new String[]{"103", "Rahul", "Finance", "60000"});
            writer.writeNext(new String[]{"104", "Pooja", "Marketing", "55000"});
            writer.writeNext(new String[]{"105", "Vikas", "Operations", "65000"});

            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }
    }
}
