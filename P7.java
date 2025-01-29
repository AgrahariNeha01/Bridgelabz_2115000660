import java.util.*;

public class P7 {
    public static void main(String[] args) {
        int a = getInpt("Enter first number: ");
        int b = getInpt("Enter second number: ");
        
        int gcd = calcGCD(a, b);
        int lcm = calcLCM(a, b, gcd);
        
        dispRes(gcd, lcm);
    }

    static int getInpt(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextInt();
    }

    static int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int calcLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    static void dispRes(int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
