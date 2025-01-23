import java.util.*;

public class P27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println(f);
        sc.close();
    }
}
