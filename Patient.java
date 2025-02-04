import java.util.*;

public class Patient {
    static String h_name;
    static int t_p = 0;

    final int p_id;
    String n, h_i;
    int a;

    Patient(String n, int a, String h_i) {
        this.n = n;
        this.a = a;
        this.h_i = h_i;
        this.p_id = ++t_p;
    }

    static int g_t_p() {
        return t_p;
    }

    void d() {
        if (this instanceof Patient) {
            System.out.println(p_id + " " + n + " " + a + " " + h_i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h_name = sc.nextLine();
        Patient[] p = new Patient[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < p.length; i++) {
            p[i] = new Patient(sc.nextLine(), sc.nextInt(), sc.nextLine().trim());
        }

        System.out.println(h_name);
        for (Patient x : p) x.d();
        System.out.println(g_t_p());
    }
}
