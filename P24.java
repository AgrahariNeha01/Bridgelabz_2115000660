import java.util.*;

public class P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int sumLoop = 0, i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        if (sumLoop == sumFormula) {
            System.out.println("Both methods give the same result: " + sumLoop);
        } else {
            System.out.println("Mismatch! Loop sum: " + sumLoop + ", Formula sum: " + sumFormula);
        }

        sc.close();
    }
}
