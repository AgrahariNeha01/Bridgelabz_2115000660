import java.lang.reflect.*;

class Student {
    String name;

    Student() {
        this.name = "Default Name";
    }

    Student(String name) {
        this.name = name;
    }
}

class P16 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;

        Student s1 = (Student) cls.getDeclaredConstructor().newInstance();
        System.out.println("Student 1: " + s1.name);

        Student s2 = (Student) cls.getDeclaredConstructor(String.class).newInstance("Neha");
        System.out.println("Student 2: " + s2.name);
    }
}
