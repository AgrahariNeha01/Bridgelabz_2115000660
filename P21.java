import java.lang.reflect.*;
import java.util.*;

class P21 {
    public static String toJson(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder("{");

        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"").append(fields[i].getName()).append("\": \"")
              .append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        return sb.append("}").toString();
    }

    public static void main(String[] args) throws Exception {
        class User {
            String name = "Neha";
            int age = 25;
        }

        User u = new User();
        System.out.println(toJson(u));
    }
}
