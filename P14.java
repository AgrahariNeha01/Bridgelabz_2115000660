import java.util.*;

class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), a[][] = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) a[i][j] = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(searchMatrix(a, t) ? "true" : "false");
    }

    static boolean searchMatrix(int[][] a, int t) {
        int r = a.length, c = a[0].length, l = 0, h = r * c - 1;
        while (l <= h) {
            int m = (l + h) / 2, x = m / c, y = m % c;
            if (a[x][y] == t) return true;
            else if (a[x][y] < t) l = m + 1;
            else h = m - 1;
        }
        return false;
    }
}
