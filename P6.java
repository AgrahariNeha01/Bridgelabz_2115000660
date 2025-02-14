import java.util.*;

class P6 {
    public static void heapSort(int[] s) {
        int n = s.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(s, n, i);
        
        for (int i = n - 1; i > 0; i--) {
            int t = s[0];
            s[0] = s[i];
            s[i] = t;
            heapify(s, i, 0);
        }
    }

    public static void heapify(int[] s, int n, int i) {
        int l = 2 * i + 1, r = 2 * i + 2, lg = i;
        if (l < n && s[l] > s[lg]) lg = l;
        if (r < n && s[r] > s[lg]) lg = r;
        if (lg != i) {
            int t = s[i];
            s[i] = s[lg];
            s[lg] = t;
            heapify(s, n, lg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) 
            s[i] = sc.nextInt();

        heapSort(s);

        for (int i : s) 
            System.out.print(i + " ");
    }
}
