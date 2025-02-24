import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class P8 {
    @LogExecutionTime
    void fastTask() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    void slowTask() {
        for (int i = 0; i < 1000000; i++);
    }

    public static void main(String[] args) throws Exception {
        P8 obj = new P8();
        Method[] methods = P8.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();
                System.out.println("Method: " + m.getName() + ", Execution Time: " + (end - start) + " ns");
            }
        }
    }
}
