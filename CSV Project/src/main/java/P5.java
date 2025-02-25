import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/employees.csv";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            reader.readNext();
            boolean found = false;

            while ((line = reader.readNext()) != null) {
                if (line[1].equalsIgnoreCase(name)) {
                    System.out.println(line[2] + ", " + line[3]);
                    found = true;
                    break;
                }
            }

            if (!found) System.out.println("Not Found");

        } catch (IOException | CsvValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
