import java.util.*;

class C {
    private double r;

    public C(double r) {
        this.r = r;
    }

    public double a() {
        return Math.PI * r * r;
    }

    public double c() {
        return 2 * Math.PI * r;
    }

    public void d() {
        System.out.println("A: " + a());
        System.out.println("C: " + c());
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C o = new C(sc.nextDouble());
        o.d();
    }
}
