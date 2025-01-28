import java.util.*;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double[] v = calculateTrigonometricFunctions(a);
        System.out.println("Sine: " + v[0]);
        System.out.println("Cosine: " + v[1]);
        System.out.println("Tangent: " + v[2]);
    }

    public static double[] calculateTrigonometricFunctions(double a) {
        double r = Math.toRadians(a);
        double[] v = new double[3];
        v[0] = Math.sin(r);
        v[1] = Math.cos(r);
        v[2] = Math.tan(r);
        return v;
    }
}




