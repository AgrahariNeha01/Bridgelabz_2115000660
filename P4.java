import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Neha")
    void completeTask() {
        System.out.println("Task completed.");
    }
}

class P4 {
    public static void main(String[] args) throws Exception {
        TaskManager t = new TaskManager();
        Method m = t.getClass().getMethod("completeTask");

        if (m.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = m.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }

        t.completeTask();
    }
}
