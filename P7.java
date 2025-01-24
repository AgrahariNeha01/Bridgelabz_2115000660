import java.util.*;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Not a natural number");
            return;
        }

        int[] e = new int[n / 2 + 1];
        int[] o = new int[n / 2 + 1];
        int ei = 0, oi = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                e[ei++] = i;
            } else {
                o[oi++] = i;
            }
        }

        System.out.print("Even: ");
        for (int i = 0; i < ei; i++) {
            System.out.print(e[i] + " ");
        }

        System.out.print("\nOdd: ");
        for (int i = 0; i < oi; i++) {
            System.out.print(o[i] + " ");
        }
    }
}
