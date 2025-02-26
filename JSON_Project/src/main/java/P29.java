import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class P29 {
    public static void main(String[] args) {
        String schemaStr = "{ \"type\": \"object\", \"properties\": { \"email\": { \"type\": \"string\", \"format\": \"email\" } }, \"required\": [\"email\"] }";
        String validJson = "{ \"email\": \"test@example.com\" }";
        String invalidJson = "{ \"email\": \"invalid-email\" }";

        validateJson(schemaStr, validJson);
        validateJson(schemaStr, invalidJson);
    }

    public static void validateJson(String schemaStr, String jsonData) {
        try {
            Schema schema = SchemaLoader.load(new JSONObject(schemaStr));
            schema.validate(new JSONObject(jsonData));
            System.out.println("Valid JSON: " + jsonData);
        } catch (Exception e) {
            System.out.println(" Invalid JSON: " + jsonData);
        }
    }
}
