import java.util.*;

class P7 {
    public static void countingSort(int[] a) {
        int[] c = new int[19], o = new int[a.length];

        for (int i : a) c[i]++;
        for (int i = 1; i < c.length; i++) c[i] += c[i - 1];
        for (int i = a.length - 1; i >= 0; i--) o[--c[a[i]]] = a[i];
        System.arraycopy(o, 0, a, 0, a.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();

        countingSort(a);

        for (int i : a) 
            System.out.print(i + " ");
    }
}
