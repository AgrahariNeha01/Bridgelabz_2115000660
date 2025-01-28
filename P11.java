import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double w = sc.nextDouble();
        double wc = calculateWindChill(t, w);
        System.out.println(wc);
    }

    public static double calculateWindChill(double t, double w) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
    }
}

