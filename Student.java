import java.util.*;

public class Student {
    static String uN;
    static int tS;
    final String rN;
    String n, g;

    Student(String n, String g, String rN) {
        this.n = n;
        this.g = g;
        this.rN = rN;
        tS++;
    }

    static void dTS() {
        System.out.println(tS);
    }

    void dD() {
        if (this instanceof Student) {
            System.out.println(n + " " + rN + " " + g);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        uN = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Student[] s = new Student[n];

        for (int i = 0; i < s.length; i++) {
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String rN = sc.nextLine();

            s[i] = new Student(name, grade, rN);
        }

        for (Student st : s) {
            st.dD();
        }

        dTS();
    }
}
