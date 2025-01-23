import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int G_F = 1;

        for (int i = no - 1; i >= 1; i--) {
            if (no % i == 0) {
                G_F = i;
                break;
            }
        }

        System.out.println(G_F);
        sc.close();
    }
}
