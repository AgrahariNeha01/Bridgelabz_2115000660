import java.util.*;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
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
