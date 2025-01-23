import java.util.*;

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = 0, O_Num = n;

        while (n != 0) {
            s += n % 10;
            n /= 10;
        }

        if (O_Num % s == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
