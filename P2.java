import java.util.*;

class Employee {
    String n;
    int id;
    double sal;

    Employee(String n, int id, double sal) {
        this.n = n;
        this.id = id;
        this.sal = sal;
    }

    void displayDetails() {
        System.out.println("Name: " + n + ", ID: " + id + ", Salary: " + sal);
    }
}

class Manager extends Employee {
    int t_size;

    Manager(String n, int id, double sal, int t_size) {
        super(n, id, sal);
        this.t_size = t_size;
    }

    void displayDetails() {
        System.out.println("Name: " + n + ", ID: " + id + ", Salary: " + sal + ", Team Size: " + t_size);
    }
}

class Developer extends Employee {
    String p_lang;

    Developer(String n, int id, double sal, String p_lang) {
        super(n, id, sal);
        this.p_lang = p_lang;
    }

    void displayDetails() {
        System.out.println("Name: " + n + ", ID: " + id + ", Salary: " + sal + ", Language: " + p_lang);
    }
}

class Intern extends Employee {
    int d;

    Intern(String n, int id, double sal, int d) {
        super(n, id, sal);
        this.d = d;
    }

    void displayDetails() {
        System.out.println("Name: " + n + ", ID: " + id + ", Salary: " + sal + ", Duration: " + d + " months");
    }
}

class P2 {
    public static void main(String[] args) {
        Employee m = new Manager("Neha", 101, 80000, 5);
        Employee d = new Developer("Sanju", 102, 60000, "Java");
        Employee i = new Intern("Om", 103, 20000, 6);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
