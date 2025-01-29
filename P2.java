import java.util.*;

class P2 {
    static Scanner sc = new Scanner(System.in);

    static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(getMax(a, b, c));
    }
}
