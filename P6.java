import java.util.*;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double s = 0.0;

        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextDouble();
            s += h[i];
        }

        double m = s / 11;
        System.out.println("Mean height: " + m);
    }
}
