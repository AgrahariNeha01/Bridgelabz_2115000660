import java.util.*;

public class P5 {
    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibItr(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, s;
        for (int i = 2; i <= n; i++) {
            s = a + b;
            a = b;
            b = s;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long s1 = System.nanoTime();
        System.out.println(fibRec(n));
        long e1 = System.nanoTime();
        System.out.println((e1 - s1) / 1_000_000 + " ms");

        long s2 = System.nanoTime();
        System.out.println(fibItr(n));
        long e2 = System.nanoTime();
        System.out.println((e2 - s2) / 1_000_000 + " ms");
    }
}
