
class Person {
    String n;
    int a;

    Person(String n, int a) {
        this.n = n;
        this.a = a;
    }

    void display() {
        System.out.println("Name: " + n + ", Age: " + a);
    }
}

class Teacher extends Person {
    String sub;

    Teacher(String n, int a, String sub) {
        super(n, a);
        this.sub = sub;
    }

    void displayRole() {
        System.out.println("Role: Teacher | Subject: " + sub);
    }
}

class Student extends Person {
    int g;

    Student(String n, int a, int g) {
        super(n, a);
        this.g = g;
    }

    void displayRole() {
        System.out.println("Role: Student | Grade: " + g);
    }
}

class Staff extends Person {
    String d;

    Staff(String n, int a, String d) {
        super(n, a);
        this.d = d;
    }

    void displayRole() {
        System.out.println("Role: Staff | Department: " + d);
    }
}

public class P9 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Neha", 30, "Math");
        Student s = new Student("Sanju", 16, 10);
        Staff st = new Staff("Om", 40, "Administration");

        t.display();
        t.displayRole();
        s.display();
        s.displayRole();
        st.display();
        st.displayRole();
    }
}
