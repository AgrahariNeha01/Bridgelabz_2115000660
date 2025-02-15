import java.util.*;

class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(missing(a) + " " + binSearch(a, t));
    }

    static int missing(int[] a) {
        int n = a.length;
        boolean[] present = new boolean[n + 1];
        for (int num : a) if (num > 0 && num <= n) present[num] = true;
        for (int i = 1; i <= n; i++) if (!present[i]) return i;
        return n + 1;
    }

    static int binSearch(int[] a, int t) {
        Arrays.sort(a);
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == t) return m;
            else if (a[m] < t) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }
}
