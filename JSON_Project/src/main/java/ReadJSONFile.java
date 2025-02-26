import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadJSONFile {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("data.json")));
            JSONObject obj = new JSONObject(content);

            Iterator<String> keys = obj.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                System.out.println(key + ": " + obj.get(key));
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
