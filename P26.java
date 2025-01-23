import java.util.*;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }

        System.out.println(f);
        sc.close();
    }
}
