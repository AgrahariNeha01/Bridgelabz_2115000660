import java.util.*;

class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(findPeak(a));
    }

    static int findPeak(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] < a[m + 1]) l = m + 1;
            else r = m;
        }
        return l;
    }
}
