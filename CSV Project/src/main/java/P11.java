import com.opencsv.CSVReader;
import java.io.*;

public class P11 {
    public static void main(String[] args) throws Exception {
        String file = "src/main/resources/large_file.csv";
        int batchSize = 100, count = 0;

        try (CSVReader r = new CSVReader(new FileReader(file))) {
            r.readNext();
            String[] l;
            while ((l = r.readNext()) != null) {
                count++;
                if (count % batchSize == 0) System.out.println("Processed: " + count);
            }
        }
        System.out.println("Total Records: " + count);
    }
}
