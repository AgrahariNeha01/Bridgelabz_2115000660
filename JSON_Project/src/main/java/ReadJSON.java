import org.json.JSONObject;
import java.nio.file.*;

public class ReadJSON {
    public static void main(String[] args) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get("data.json")));
        JSONObject obj = new JSONObject(data);

        System.out.println(obj.getString("name"));
        System.out.println(obj.getString("email"));
    }
}
