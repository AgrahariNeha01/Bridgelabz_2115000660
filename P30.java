
import java.util.*;

public class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();

        int[] f = NC.findF(n);
        int gF = NC.gF(f);
        int sumF = NC.sumF(f);
        int prodF = NC.prodF(f);
        double prodC = NC.prodC(f);
        boolean pN = NC.isP(n, f);
        boolean aN = NC.isA(n, f);
        boolean dN = NC.isD(n, f);
        boolean sN = NC.isS(n);

        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest Factor: " + gF);
        System.out.println("Sum of Factors: " + sumF);
        System.out.println("Product of Factors: " + prodF);
        System.out.println("Product of Cube of Factors: " + prodC);
        System.out.println("Is Perfect Number: " + pN);
        System.out.println("Is Abundant Number: " + aN);
        System.out.println("Is Deficient Number: " + dN);
        System.out.println("Is Strong Number: " + sN);
    }
}

class NC {
    public static int[] findF(int n) {
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

    public static int gF(int[] f) {
        int g = Integer.MIN_VALUE;
        for (int i : f) {
            if (i > g) {
                g = i;
            }
        }
        return g;
    }

    public static int sumF(int[] f) {
        int sum = 0;
        for (int i : f) {
            sum += i;
        }
        return sum;
    }

    public static int prodF(int[] f) {
        int prod = 1;
        for (int i : f) {
            prod *= i;
        }
        return prod;
    }

    public static double prodC(int[] f) {
        double prod = 1;
        for (int i : f) {
            prod *= Math.pow(i, 3);
        }
        return prod;
    }

    public static boolean isP(int n, int[] f) {
        int sum = 0;
        for (int i : f) {
            if (i != n) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isA(int n, int[] f) {
        int sum = 0;
        for (int i : f) {
            if (i != n) {
                sum += i;
            }
        }
        return sum > n;
    }

    public static boolean isD(int n, int[] f) {
        int sum = 0;
        for (int i : f) {
            if (i != n) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static boolean isS(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    private static int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact *= i;
        }
        return fact;
    }
}

