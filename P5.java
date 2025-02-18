import java.util.*;

abstract class JobRole {
    String name;
    JobRole(String name) { this.name = name; }
    public String toString() { return name; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    String candidate;
    T role;

    Resume(String candidate, T role) {
        this.candidate = candidate;
        this.role = role;
    }

    void show() {
        System.out.println(candidate + " - " + role);
    }
}

class ScreeningSystem {
    static void processResumes(List<? extends JobRole> resumes) {
        System.out.println("Processing resumes for different roles...");
        for (JobRole r : resumes) {
            System.out.println("Screening resume for: " + r);
        }
    }
}

public class P5 {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Neha", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Sanju", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Om", new ProductManager());

        List<JobRole> resumes = Arrays.asList(r1.role, r2.role, r3.role);

        System.out.println("Submitted Resumes:");
        r1.show();
        r2.show();
        r3.show();

        System.out.println("\nScreening Process:");
        ScreeningSystem.processResumes(resumes);
    }
}
