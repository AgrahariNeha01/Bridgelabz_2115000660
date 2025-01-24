import java.util.*;

class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[10];
        int t = n;

        while (t > 0) {
            f[t % 10]++;
            t /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
            }
        }
    }
}
