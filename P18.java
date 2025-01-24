import java.util.*;

class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][3];
        double[] p = new double[n];
        char[] g = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                while (x < 0) {
                    x = sc.nextInt();
                }
                m[i][j] = x;
            }
            int t = m[i][0] + m[i][1] + m[i][2];
            p[i] = t / 3.0;
            g[i] = (p[i] >= 80) ? 'A' : (p[i] >= 70) ? 'B' : (p[i] >= 60) ? 'C' : (p[i] >= 50) ? 'D' : (p[i] >= 40) ? 'E' : 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %.2f %c\n", m[i][0], m[i][1], m[i][2], p[i], g[i]);
        }
    }
}




