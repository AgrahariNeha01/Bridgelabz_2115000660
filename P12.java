import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (i % no == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
