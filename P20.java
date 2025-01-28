import java.util.*;

public class P20 {

    public static String findYoungest(int[] a) {
        int y = a[0];
        String f = "Amar";

        for (int i = 1; i < 3; i++) {
            if (a[i] < y) {
                y = a[i];
                if (i == 1) f = "Akbar";
                else f = "Anthony";
            }
        }
        return f;
    }

    public static String findTallest(int[] h) {
        int t = h[0];
        String f = "Amar";

        for (int i = 1; i < 3; i++) {
            if (h[i] > t) {
                t = h[i];
                if (i == 1) f = "Akbar";
                else f = "Anthony";
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] h = new int[3];

        a[0] = sc.nextInt();
        h[0] = sc.nextInt();

        a[1] = sc.nextInt();
        h[1] = sc.nextInt();

        a[2] = sc.nextInt();
        h[2] = sc.nextInt();

        String youngest = findYoungest(a);
        String tallest = findTallest(h);

        sc.close();
    }
}

