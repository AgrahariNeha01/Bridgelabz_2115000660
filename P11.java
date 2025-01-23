import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        for (int i = 1; i < no; i++) {
            if (no % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
