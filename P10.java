import java.util.*;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Not a positive integer");
            return;
        }

        String[] r = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                r[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                r[i] = "Fizz";
            } else if (i % 5 == 0) {
                r[i] = "Buzz";
            } else {
                r[i] = Integer.toString(i);
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + r[i]);
        }
    }
}
