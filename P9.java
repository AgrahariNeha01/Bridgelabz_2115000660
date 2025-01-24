import java.util.*;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int[] a = new int[r * c];
        int idx = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[idx++] = m[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
