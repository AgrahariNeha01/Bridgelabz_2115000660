import java.util.*;

public class Vehicle {
    static double f;
    final String rN;
    String o, t;

    Vehicle(String o, String t, String rN) {
        this.o = o;
        this.t = t;
        this.rN = rN;
    }

    static void uF(double nF) {
        f = nF;
    }

    void sD() {
        if (this instanceof Vehicle) {
            System.out.println(o + " " + t + " " + rN + " " + f);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        uF(sc.nextDouble());
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] v = new Vehicle[n];

        for (int i = 0; i < v.length; i++) {
            String o = sc.nextLine();
            String t = sc.nextLine();
            String rN = sc.nextLine();

            v[i] = new Vehicle(o, t, rN);
        }

        for (Vehicle vhl : v) {
            vhl.sD();
        }
    }
}
