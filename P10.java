import java.util.*;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(findNeg(a));
    }

    static int findNeg(int[] a) {
        for (int i = 0; i < a.length; i++) 
            if (a[i] < 0) return i;
        return -1;
    }
}
