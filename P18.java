import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Neha")
class P18 {}

class Main {
    public static void main(String[] args) {
        Class<P18> cls = P18.class;
        if (cls.isAnnotationPresent(Author.class)) {
            Author a = cls.getAnnotation(Author.class);
            System.out.println("Author: " + a.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}
