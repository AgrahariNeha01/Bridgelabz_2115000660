import java.util.*;

public class P8 {
    public static void main(String[] args) {
        double t = getInpt();
        char ch = getChoice();
        
        if (ch == 'F' || ch == 'f') {
            double c = fToC(t);
            dispRes(c, "C");
        } else if (ch == 'C' || ch == 'c') {
            double f = cToF(t);
            dispRes(f, "F");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static double getInpt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        return sc.nextDouble();
    }

    static char getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert to (C)elsius or (F)ahrenheit? ");
        return sc.next().charAt(0);
    }

    static double fToC(double t) {
        return (t - 32) * 5 / 9;
    }

    static double cToF(double t) {
        return (t * 9 / 5) + 32;
    }

    static void dispRes(double t, String scale) {
        System.out.println("Converted temperature: " + t + " " + scale);
    }
}
