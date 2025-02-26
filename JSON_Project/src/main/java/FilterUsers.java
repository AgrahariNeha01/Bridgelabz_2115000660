import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsers {
    public static void main(String[] args) {
        String data = """
                [
                    {"name": "Amit", "age": 30, "email": "amit@example.com"},
                    {"name": "Neha", "age": 22, "email": "neha@example.com"},
                    {"name": "Rohan", "age": 28, "email": "rohan@example.com"},
                    {"name": "Sita", "age": 24, "email": "sita@example.com"}
                ]
                """;

        JSONArray arr = new JSONArray(data);

        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                System.out.println(obj);
            }
        }
    }
}
