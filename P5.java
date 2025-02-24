import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

class BugTracker {
    @BugReport(description = "NullPointerException occurs in edge cases")
    @BugReport(description = "Performance issue when handling large data")
    void process() {
        System.out.println("Processing...");
    }
}

class P5 {
    public static void main(String[] args) throws Exception {
        Method m = BugTracker.class.getMethod("process");

        if (m.isAnnotationPresent(BugReports.class)) {
            BugReports reports = m.getAnnotation(BugReports.class);
            for (BugReport bug : reports.value()) {
                System.out.println("Bug: " + bug.description());
            }
        }

        new BugTracker().process();
    }
}
