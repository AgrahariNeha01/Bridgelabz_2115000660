import java.util.*;

class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][3];
        double[] p = new double[n];
        char[] g = new char[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                while (x < 0) x = sc.nextInt();
                m[i][j] = x;
            }
            int t = m[i][0] + m[i][1] + m[i][2];
            p[i] = t / 3.0;
            if (p[i] >= 80) g[i] = 'A';
            else if (p[i] >= 70) g[i] = 'B';
            else if (p[i] >= 60) g[i] = 'C';
            else if (p[i] >= 50) g[i] = 'D';
            else if (p[i] >= 40) g[i] = 'E';
            else g[i] = 'R';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %.2f %c\n", m[i][0], m[i][1], m[i][2], p[i], g[i]);
        }
    }
}
