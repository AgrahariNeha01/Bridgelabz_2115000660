import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double rounds = roundsToCompleteRun(a, b, c);
        System.out.println(rounds);
    }

    static double roundsToCompleteRun(int a, int b, int c) {
        int perimeter = a + b + c;
        return 5000.0 / perimeter;
    }
}


