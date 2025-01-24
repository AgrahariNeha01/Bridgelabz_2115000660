import java.util.*;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxF = 10;
        int[] f = new int[maxF];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == maxF) {
                    maxF *= 2;
                    int[] t = new int[maxF];
                    for (int j = 0; j < f.length; j++) {
                        t[j] = f[j];
                    }
                    f = t;
                }
                f[idx++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(f[i] + " ");
        }
    }
}
