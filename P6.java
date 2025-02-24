import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class P6 {
    @ImportantMethod
    void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    void normalTask() {
        System.out.println("Executing normal task...");
    }

    void regularTask() {
        System.out.println("Executing regular task...");
    }

    public static void main(String[] args) throws Exception {
        Method[] methods = P6.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + m.getName() + ", Importance Level: " + im.level());
            }
        }
    }
}
