import java.util.*;

class P4{
    public static void quickSort(int[] p, int l, int r) {
        if (l < r) {
            int pi = partition(p, l, r);
            quickSort(p, l, pi - 1);
            quickSort(p, pi + 1, r);
        }
    }

    public static int partition(int[] p, int l, int r) {
        int piv = p[r], i = l - 1;
        for (int j = l; j < r; j++) {
            if (p[j] < piv) {
                i++;
                int t = p[i];
                p[i] = p[j];
                p[j] = t;
            }
        }
        int t = p[i + 1];
        p[i + 1] = p[r];
        p[r] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) 
            p[i] = sc.nextInt();

        quickSort(p, 0, n - 1);

        for (int i : p) 
            System.out.print(i + " ");
    }
}
