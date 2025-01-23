import java.util.*;

public class P36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double s = sc.nextDouble();
        String op = sc.next();

        double res = 0;
        boolean validOp = true;

        switch (op) {
            case "+":
                res = f + s;
                break;
            case "-":
                res = f - s;
                break;
            case "*":
                res = f * s;
                break;
            case "/":
                if (s != 0) {
                    res = f / s;
                } else {
                    validOp = false;
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                validOp = false;
                System.out.println("Invalid Operator");
                break;
        }

        if (validOp) {
            System.out.println(res);
        }

        sc.close();
    }
}
