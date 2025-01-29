import java.util.*;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        char ch = sc.next().charAt(0);
        
        double res = 0;
        switch (ch) {
            case '+':
                res = add(n1, n2);
                break;
            case '-':
                res = sub(n1, n2);
                break;
            case '*':
                res = mul(n1, n2);
                break;
            case '/':
                if (n2 != 0) {
                    res = div(n1, n2);
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        dispRes(res);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static void dispRes(double res) {
        System.out.println("Result: " + res);
    }
}
