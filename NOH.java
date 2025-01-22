import java.util.*;
public class NOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_handshake=(n * (n - 1)) / 2;
        System.out.println("Total number of handshake is "+total_handshake);
        sc.close();
    }
}
