
import java.util.*;

public class P36 {
    static int[][] gS(int n) {
        int[][] s = new int[n][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt(); 
            s[i][2] = sc.nextInt(); 
        }
        return s;
    }

    static double[][] cR(int[][] s) {
        int n = s.length;
        double[][] r = new double[n][3];
        for (int i = 0; i < n; i++) {
            int t = s[i][0] + s[i][1] + s[i][2];
            r[i][0] = t;
            r[i][1] = Math.round(t / 3.0 * 100.0) / 100.0;
            r[i][2] = Math.round(t / 3.0 * 100.0) / 3.0;
        }
        return r;
    }

    static void d(int[][] s, double[][] r) {
        System.out.println("P\tC\tM\tT\tA\tP%");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "\t");
            System.out.println((int) r[i][0] + "\t" + r[i][1] + "\t" + Math.round(r[i][2] * 100.0) / 100.0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[][] s = gS(n);
        double[][] r = cR(s);
        d(s, r);
    }
}



