import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, dept;
    double sal;

    Employee(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    void display() {
        System.out.println(id + " " + name + " " + dept + " " + sal);
    }
}

class P4 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Amit", "IT", 50000));
        empList.add(new Employee(2, "Neha", "HR", 60000));
        empList.add(new Employee(3, "Raj", "Finance", 55000));

        String file = "employees.dat";

        // Serialize employees
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(empList);
            System.out.println("Employees saved.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Deserialize and display employees
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Employee> readList = (List<Employee>) ois.readObject();
            System.out.println("Employee List:");
            for (Employee e : readList) e.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
