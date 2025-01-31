import java.util.*;

class B {
    private String t, a;
    private double p;

    public B(String t, String a, double p) {
        this.t = t;
        this.a = a;
        this.p = p;
    }

    public void d() {
        System.out.println("T: " + t);
        System.out.println("A: " + a);
        System.out.println("P: " + p);
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B o = new B(sc.next(), sc.next(), sc.nextDouble());
        o.d();
    }
}
