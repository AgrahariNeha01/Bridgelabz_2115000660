import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON {
    public static void main(String[] args) {
        String json = "{\"name\":\"Neha\",\"age\":20,\"email\":\"neha@example.com\"}";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(json);
            System.out.println("Valid JSON: " + node);
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
