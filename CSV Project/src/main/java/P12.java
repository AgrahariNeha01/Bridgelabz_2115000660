import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;

public class P12 {
    public static void main(String[] args) throws Exception {
        String file = "src/main/resources/data.csv";
        Map<String, String[]> map = new HashMap<>();
        Set<String[]> dups = new HashSet<>();

        try (CSVReader r = new CSVReader(new FileReader(file))) {
            r.readNext();
            String[] l;
            while ((l = r.readNext()) != null) {
                if (map.containsKey(l[0])) dups.add(l);
                else map.put(l[0], l);
            }
        }
        dups.forEach(d -> System.out.println(Arrays.toString(d)));
    }
}
