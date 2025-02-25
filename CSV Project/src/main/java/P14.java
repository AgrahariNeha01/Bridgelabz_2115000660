import org.json.JSONArray;
import org.json.JSONObject;
import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class P14 {
    static void jsonToCsv(String jsonData, String csvFile) throws Exception {
        JSONArray students = new JSONArray(jsonData);

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});

            for (int i = 0; i < students.length(); i++) {
                JSONObject obj = students.getJSONObject(i);
                writer.writeNext(new String[]{
                        obj.optString("ID", ""),
                        obj.optString("Name", ""),
                        obj.optString("Age", ""),
                        obj.optString("Marks", "")
                });
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String jsonData = "[{\"ID\": \"1\", \"Name\": \"Neha\", \"Age\": \"21\", \"Marks\": \"90\"}," +
                "{\"ID\": \"2\", \"Name\": \"Rahul\", \"Age\": \"22\", \"Marks\": \"85\"}]";

        String csvFile = "students.csv"; // CSV file ka naam
        jsonToCsv(jsonData, csvFile);

        System.out.println("Conversion Done!");
    }
}
