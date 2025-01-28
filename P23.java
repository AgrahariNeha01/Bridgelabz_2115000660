import java.util.*;

public class P23 {

    public static double[] findRoots(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double[] r = new double[2];

        if (d > 0) {
            r[0] = (-b + Math.sqrt(d)) / (2 * a);
            r[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            r[0] = -b / (2 * a);
            r = new double[]{r[0]};
        } else {
            return new double[0];
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double[] r = findRoots(a, b, c);

        sc.close();
    }
}
