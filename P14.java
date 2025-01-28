
import java.util.*;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int rSum = sumRecursive(n);
        int fSum = sumFormula(n);
        
        System.out.println("Recursive Sum: " + rSum);
        System.out.println("Formula Sum: " + fSum);
        
        if (rSum == fSum) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results do not match");
        }
    }

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}



