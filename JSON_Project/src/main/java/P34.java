import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.*;
import java.io.IOException;

public class P34 {
    public static void main(String[] args) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get("data.csv")));
        String[] rows = data.split("\n");
        String[] headers = rows[0].split(",");

        JSONArray arr = new JSONArray();
        for (int i = 1; i < rows.length; i++) {
            String[] cols = rows[i].split(",");
            JSONObject obj = new JSONObject();
            for (int j = 0; j < headers.length; j++) {
                obj.put(headers[j], cols[j]);
            }
            arr.put(obj);
        }

        System.out.println(arr);
    }
}
