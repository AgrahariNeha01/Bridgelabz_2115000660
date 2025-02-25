import com.opencsv.*;
import java.io.*;
import java.util.*;

public class P10 {
    public static void main(String[] args) throws Exception {
        String file1 = "src/main/resources/students1.csv";
        String file2 = "src/main/resources/students2.csv";
        String outFile = "src/main/resources/merged_students.csv";

        Map<String, String[]> map = new HashMap<>();

        try (CSVReader r1 = new CSVReader(new FileReader(file1))) {
            r1.readNext();
            String[] l;
            while ((l = r1.readNext()) != null) map.put(l[0], new String[]{l[1], l[2]});
        }

        try (CSVReader r2 = new CSVReader(new FileReader(file2));
             CSVWriter w = new CSVWriter(new FileWriter(outFile))) {
            w.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});
            r2.readNext();
            String[] l;
            while ((l = r2.readNext()) != null) {
                if (map.containsKey(l[0])) {
                    String[] d = map.get(l[0]);
                    w.writeNext(new String[]{l[0], d[0], d[1], l[1], l[2]});
                }
            }
        }
    }
}
