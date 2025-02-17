import java.util.*;

public class P2 {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {
            int m = l + (h - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, h);
            merge(arr, l, m, h);
        }
    }

    static void merge(int[] arr, int l, int m, int h) {
        int[] L = Arrays.copyOfRange(arr, l, m + 1);
        int[] R = Arrays.copyOfRange(arr, m + 1, h + 1);
        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length) arr[k++] = (L[i] < R[j]) ? L[i++] : R[j++];
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }

    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }

    static int partition(int[] arr, int l, int h) {
        int p = arr[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (arr[j] < p) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        int t = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n], arr2 = new int[n], arr3 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr2[i] = arr3[i] = sc.nextInt();
        }

        long s1 = System.nanoTime();
        bubbleSort(arr1);
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        mergeSort(arr2, 0, n - 1);
        long e2 = System.nanoTime();

        long s3 = System.nanoTime();
        quickSort(arr3, 0, n - 1);
        long e3 = System.nanoTime();

        System.out.println("Bubble: " + (e1 - s1) + " ns");
        System.out.println("Merge: " + (e2 - s2) + " ns");
        System.out.println("Quick: " + (e3 - s3) + " ns");
    }
}
