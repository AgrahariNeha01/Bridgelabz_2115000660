
import java.util.*;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = findFactors(n);
        
        System.out.println("Factors: ");
        for (int i : f) {
            System.out.print(i + " ");
        }

        int s = sumFactors(f);
        int p = productFactors(f);
        int sq = sumOfSquares(f);

        System.out.println("\nSum of factors: " + s);
        System.out.println("Product of factors: " + p);
        System.out.println("Sum of square of factors: " + sq);
    }

    public static int[] findFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        int[] f = new int[c];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f[idx++] = i;
            }
        }
        return f;
    }

    public static int sumFactors(int[] f) {
        int s = 0;
        for (int i : f) {
            s += i;
        }
        return s;
    }

    public static int productFactors(int[] f) {
        int p = 1;
        for (int i : f) {
            p *= i;
        }
        return p;
    }

    public static int sumOfSquares(int[] f) {
        int sq = 0;
        for (int i : f) {
            sq += Math.pow(i, 2);
        }
        return sq;
    }
}




