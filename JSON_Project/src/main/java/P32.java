import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P32 {
    public static void main(String[] args) throws Exception {
        String file1 = new String(Files.readAllBytes(Paths.get("file1.json")));
        String file2 = new String(Files.readAllBytes(Paths.get("file2.json")));

        JSONObject json1 = new JSONObject(file1);
        JSONObject json2 = new JSONObject(file2);

        json1.putAll(json2);

        System.out.println(json1);
    }
}
