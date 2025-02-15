import java.util.*;

class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(first(a, t) + " " + last(a, t));
    }

    static int first(int[] a, int t) {
        int l = 0, h = a.length - 1, ans = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == t) {
                ans = m;
                h = m - 1;
            } else if (a[m] < t) l = m + 1;
            else h = m - 1;
        }
        return ans;
    }

    static int last(int[] a, int t) {
        int l = 0, h = a.length - 1, ans = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == t) {
                ans = m;
                l = m + 1;
            } else if (a[m] < t) l = m + 1;
            else h = m - 1;
        }
        return ans;
    }
}
