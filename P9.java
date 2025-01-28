import java.util.*;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] res = findRemainderAndQuotient(n, d);
        System.out.println("Quotient: " + res[0]);
        System.out.println("Remainder: " + res[1]);
    }

    public static int[] findRemainderAndQuotient(int n, int d) {
        int q = n / d;
        int r = n % d;
        return new int[]{q, r};
    }
}

