
import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = maxHandshakes(N);
        System.out.println("The maximum number of handshakes among " + N + " students is " + H);
    }

    static int maxHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}

