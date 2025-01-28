import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P1 = sc.nextInt();
        float R1 = sc.nextFloat();
        int T1 = sc.nextInt();
        float SI = calcSI(P1, R1, T1);
        System.out.println("The Simple Interest is " + SI + " for Principal " + P1 + ", Rate of Interest " + R1 + " and Time " + T1);
    }

    static float calcSI(int p, float r, int t) {
        return p * r * t / 100;
    }
}


