import java.util.*;

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double d = dist(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + d);
        
        double[] eq = line(x1, y1, x2, y2);
        System.out.println("Slope: " + eq[0]);
        System.out.println("Y-intercept: " + eq[1]);
    }

    public static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] line(double x1, double y1, double x2, double y2) {
        double[] r = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        r[0] = m;
        r[1] = b;
        return r;
    }
}

