import java.util.*;

abstract class Employee {
    private int id;
    private String name;
    private double baseSal;

    public Employee(int id, String name, double baseSal) {
        this.id = id;
        this.name = name;
        this.baseSal = baseSal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSal() {
        return baseSal;
    }

    public abstract double calcSal();

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calcSal());
    }
}

interface Department {
    void assignDept(String dept);
    String getDeptDetails();
}

class FullTimeEmp extends Employee implements Department {
    private String dept;

    public FullTimeEmp(int id, String name, double baseSal) {
        super(id, name, baseSal);
    }

    public double calcSal() {
        return getBaseSal();
    }

    public void assignDept(String dept) {
        this.dept = dept;
    }

    public String getDeptDetails() {
        return dept;
    }
}

class PartTimeEmp extends Employee implements Department {
    private String dept;
    private int hrs;
    private double rate;

    public PartTimeEmp(int id, String name, int hrs, double rate) {
        super(id, name, 0);
        this.hrs = hrs;
        this.rate = rate;
    }

    public double calcSal() {
        return hrs * rate;
    }

    public void assignDept(String dept) {
        this.dept = dept;
    }

    public String getDeptDetails() {
        return dept;
    }
}

public class P1 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        FullTimeEmp e1 = new FullTimeEmp(101, "Neha", 50000);
        PartTimeEmp e2 = new PartTimeEmp(102, "Bibbu", 20, 500);

        e1.assignDept("HR");
        e2.assignDept("IT");

        empList.add(e1);
        empList.add(e2);

        for (Employee e : empList) {
            e.display();
        }
    }
}
