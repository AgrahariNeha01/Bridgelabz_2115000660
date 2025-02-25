import com.opencsv.*;
import java.io.*;
import java.util.*;

public class P7 {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/resources/employees.csv";

        List<String[]> data = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            data.add(header);

            List<String[]> records = reader.readAll();
            records.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

            for (int i = 0; i < Math.min(5, records.size()); i++) {
                System.out.println(Arrays.toString(records.get(i)));
            }
        }
    }
}
