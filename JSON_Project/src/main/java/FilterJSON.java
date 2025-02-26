import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJSON {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Amit\",\"age\":30},{\"name\":\"Neha\",\"age\":20},{\"name\":\"Raj\",\"age\":27}]";

        JSONArray arr = new JSONArray(json);
        JSONArray filteredArr = new JSONArray();

        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                filteredArr.put(obj);
            }
        }

        System.out.println(filteredArr);
    }
}
