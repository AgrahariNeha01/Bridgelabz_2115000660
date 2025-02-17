import java.util.*;

public class P1 {
    static boolean linearSearch(int[] arr, int t) {
        for (int x : arr) if (x == t) return true;
        return false;
    }

    static boolean binarySearch(int[] arr, int t) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == t) return true;
            if (arr[m] < t) l = m + 1;
            else h = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long s1 = System.nanoTime();
        linearSearch(arr, t);
        long e1 = System.nanoTime();
        long t1 = e1 - s1;

        Arrays.sort(arr);
        long s2 = System.nanoTime();
        binarySearch(arr, t);
        long e2 = System.nanoTime();
        long t2 = e2 - s2;

        System.out.println("Linear: " + t1 + " ns");
        System.out.println("Binary: " + t2 + " ns");
    }
}
