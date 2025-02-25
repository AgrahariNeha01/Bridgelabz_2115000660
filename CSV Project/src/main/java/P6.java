import com.opencsv.*;
import java.io.*;
import java.util.*;

public class P6 {
    public static void main(String[] args) throws Exception {
        String inputFile = "src/main/resources/employees.csv";
        String outputFile = "src/main/resources/employees_updated.csv";

        List<String[]> data = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(inputFile))) {
            String[] line;
            data.add(reader.readNext());

            while ((line = reader.readNext()) != null) {
                if (line[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(line[3]);
                    salary *= 1.1;
                    line[3] = String.format("%.2f", salary);
                }
                data.add(line);
            }
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            writer.writeAll(data);
        }

        System.out.println("Salary updated successfully in " + outputFile);
    }
}
