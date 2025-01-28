import java.util.*;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        boolean p = NC.isPrime(n);
        boolean ne = NC.isNeon(n);
        boolean s = NC.isSpy(n);
        boolean a = NC.isAutomorphic(n);
        boolean b = NC.isBuzz(n);

        System.out.println("Is Prime: " + p);
        System.out.println("Is Neon: " + ne);
        System.out.println("Is Spy: " + s);
        System.out.println("Is Automorphic: " + a);
        System.out.println("Is Buzz: " + b);
    }
}

class NC {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return Integer.toString(sq).endsWith(Integer.toString(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
