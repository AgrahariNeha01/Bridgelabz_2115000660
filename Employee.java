import java.util.*;

public class Employee {
    static String cName;
    static int tE;
    final String id;
    String name, desig;

    Employee(String name, String desig, String id) {
        this.name = name;
        this.desig = desig;
        this.id = id;
        tE++;
    }

    static void dTE() {
        System.out.println(tE);
    }

    void eD() {
        if (this instanceof Employee) {
            System.out.println(name + " " + id + " " + desig);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] e = new Employee[n];

        for (int i = 0; i < e.length; i++) {
            String name = sc.nextLine();
            String desig = sc.nextLine();
            String id = sc.nextLine();

            e[i] = new Employee(name, desig, id);
        }

        for (Employee emp : e) {
            emp.eD();
        }

        dTE();
    }
}
