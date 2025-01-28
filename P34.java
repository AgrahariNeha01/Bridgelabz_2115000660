import java.util.*;

public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        if (collinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (Slope).");
        } else {
            System.out.println("Not Collinear (Slope).");
        }
        
        if (collinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (Area).");
        } else {
            System.out.println("Not Collinear (Area).");
        }
    }

    public static boolean collinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double sAB = (y2 - y1) / (x2 - x1);
        double sBC = (y3 - y2) / (x3 - x2);
        double sAC = (y3 - y1) / (x3 - x1);
        
        return (sAB == sBC && sBC == sAC);
    }

    public static boolean collinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return a == 0;
    }
}
