import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class P7 {
    @Todo(task = "Implement login feature", assignedTo = "Neha", priority = "HIGH")
    void login() {
        System.out.println("Login functionality pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Amit")
    void optimizeDB() {
        System.out.println("Database optimization pending...");
    }

    @Todo(task = "Improve UI design", assignedTo = "Priya", priority = "LOW")
    void improveUI() {
        System.out.println("UI improvements pending...");
    }

    public static void main(String[] args) throws Exception {
        Method[] methods = P7.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + ", Assigned To: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}
