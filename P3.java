import java.util.*;

class P3 {
    public static void mergeSort(int[] p, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(p, l, m);
            mergeSort(p, m + 1, r);
            merge(p, l, m, r);
        }
    }

    public static void merge(int[] p, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = p[l + i];
        for (int i = 0; i < n2; i++) R[i] = p[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) p[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) p[k++] = L[i++];
        while (j < n2) p[k++] = R[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) 
            p[i] = sc.nextInt();

        mergeSort(p, 0, n - 1);

        for (int i : p) 
            System.out.print(i + " ");
    }
}
