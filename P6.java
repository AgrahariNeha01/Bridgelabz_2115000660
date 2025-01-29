import java.util.*;

public class P6 {
    public static void main(String[] args) {
        int n = getInpt();
        int fact = calcFact(n);
        dispRes(fact);
    }

    static int getInpt() {
        Scanner sc = new Scanner(System.in);
      
        return sc.nextInt();
    }

    static int calcFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcFact(n - 1);
    }

    static void dispRes(int fact) {
        System.out.println("Factorial: " + fact);
    }
}
