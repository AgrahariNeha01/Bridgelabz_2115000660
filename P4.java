import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neha = sc.nextInt();
        boolean isNehaPrime = true;

        if (neha <= 1) {
            isNehaPrime = false;
        } else {
            for (int i = 2; i < neha; i++) {
                if (neha % i == 0) {
                    isNehaPrime = false;
                    break;
                }
            }
        }

        if (isNehaPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
