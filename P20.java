import java.lang.reflect.*;
import java.util.*;

class P20 {
    public static <T> T toObject(Class<T> cls, Map<String, Object> props) throws Exception {
        T obj = cls.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> e : props.entrySet()) {
            Field f = cls.getDeclaredField(e.getKey());
            f.setAccessible(true);
            f.set(obj, e.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        class User {
            String name;
            int age;
        }

        Map<String, Object> props = new HashMap<>();
        props.put("name", "Neha");
        props.put("age", 25);

        User u = toObject(User.class, props);
        System.out.println("Name: " + u.name + ", Age: " + u.age);
    }
}
