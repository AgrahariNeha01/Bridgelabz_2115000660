import org.json.JSONObject;

public class MergeJSON {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Neha");
        obj1.put("age", 20);

        JSONObject obj2 = new JSONObject();
        obj2.put("email", "neha@example.com");
        obj2.put("city", "Delhi");

        JSONObject merged = new JSONObject(obj1, JSONObject.getNames(obj1));
        for (String key : JSONObject.getNames(obj2)) {
            merged.put(key, obj2.get(key));
        }

        System.out.println(merged);
    }
}
