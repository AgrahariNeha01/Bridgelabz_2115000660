import java.util.*;

class Emp {
    private String n;
    private int id;
    private double s;

    public Emp(String n, int id, double s) {
        this.n = n;
        this.id = id;
        this.s = s;
    }

    public void d() {
        System.out.println("N: " + n);
        System.out.println("ID: " + id);
        System.out.println("S: " + s);
    }
}

public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp(sc.next(), sc.nextInt(), sc.nextDouble());
        e.d();
    }
}
