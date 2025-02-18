import java.util.*;

abstract class CourseType {
    String name;
    CourseType(String name) { this.name = name; }
    public String toString() { return name; }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) { super(name); }
}

class Course<T extends CourseType> {
    String name;
    T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    void show() {
        System.out.println(name + " - " + type);
    }
}

class University {
    static void showCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}

public class P3 {
    public static void main(String[] args) {
        Course<ExamCourse> c1 = new Course<>("Data Structures", new ExamCourse("Final Exam"));
        Course<AssignmentCourse> c2 = new Course<>("Software Engineering", new AssignmentCourse("Project-Based"));
        Course<ResearchCourse> c3 = new Course<>("AI Research", new ResearchCourse("Thesis-Based"));

        List<CourseType> courses = Arrays.asList(c1.type, c2.type, c3.type);

        System.out.println("Available Courses:");
        University.showCourses(courses);
    }
}
