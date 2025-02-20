import java.util.*;

class P21 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<String>> deptMap = new HashMap<>();

        for (Employee e : employees) {
            deptMap.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e.name);
        }

        System.out.println(deptMap);
    }
}

class Employee {
    String name, dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
