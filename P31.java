import java.util.*;

public class P31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = 0, O_Num = n;

        while (n != 0) {
            int rem = n % 10;
            s += rem * rem * rem;
            n /= 10;
        }

        if (O_Num == s) {
            System.out.println(O_Num + " is an Armstrong number.");
        } else {
            System.out.println(O_Num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
