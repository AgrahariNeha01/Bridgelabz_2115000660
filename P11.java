import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class P11 {
    @JsonField(name = "user_name")
    String username;

    @JsonField(name = "user_age")
    int age;

    P11(String username, int age) {
        this.username = username;
        this.age = age;
    }

    String toJson() throws Exception {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = P11.class.getDeclaredFields();
        List<String> jsonPairs = new ArrayList<>();

        for (Field f : fields) {
            if (f.isAnnotationPresent(JsonField.class)) {
                String key = f.getAnnotation(JsonField.class).name();
                Object value = f.get(this);
                jsonPairs.add("\"" + key + "\": \"" + value + "\"");
            }
        }

        json.append(String.join(", ", jsonPairs)).append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        P11 user = new P11("Neha", 22);
        System.out.println(user.toJson());
    }
}
