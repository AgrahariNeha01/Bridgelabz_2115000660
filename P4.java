import java.util.*;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double t = 0.0;
        int i = 0;

        while (true) {
            double x = sc.nextDouble();
            if (x <= 0 || i == 10) {
                break;
            }
            a[i++] = x;
        }

        for (int j = 0; j < i; j++) {
            t += a[j];
            System.out.println(a[j]);
        }

        System.out.println("Total: " + t);
    }
}
