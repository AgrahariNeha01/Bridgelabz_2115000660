import org.json.JSONObject;
import org.json.JSONArray;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Neha");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("English");

        student.put("subjects", subjects);

        System.out.println(student.toString(2));
    }
}
