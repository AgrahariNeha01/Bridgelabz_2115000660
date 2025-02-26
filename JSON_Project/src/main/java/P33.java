import org.json.JSONObject;
import org.json.XML;

public class P33 {
    public static void main(String[] args) {
        String json = "{\"name\":\"Neha\",\"age\":22,\"email\":\"neha@example.com\"}";

        JSONObject obj = new JSONObject(json);
        String xml = XML.toString(obj);

        System.out.println(xml);
    }
}
