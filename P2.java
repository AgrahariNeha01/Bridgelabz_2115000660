import java.util.*;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n];

        for (int i = 0; i < n; i++) 
            e[i] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int k = e[i], j = i - 1;
            while (j >= 0 && e[j] > k) {
                e[j + 1] = e[j];
                j--;
            }
            e[j + 1] = k;
        }

        for (int i : e) 
            System.out.print(i + " ");
    }
}
