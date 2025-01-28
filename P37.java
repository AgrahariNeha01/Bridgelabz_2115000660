
import java.util.*;

public class P37 {
    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = rand.nextInt(10);             }
        }
        return m;
    }

    static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, k = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int l = 0; l < k; l++) {
                    res[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return res;
    }

    static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = m[i][j];
            }
        }
        return res;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular.");
        double[][] res = new double[2][2];
        res[0][0] = m[1][1] / (double) det;
        res[0][1] = -m[0][1] / (double) det;
        res[1][0] = -m[1][0] / (double) det;
        res[1][1] = m[0][0] / (double) det;
        return res;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular.");
        double[][] res = new double[3][3];
        res[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / (double) det;
        res[0][1] = (m[0][2] * m[2][1] - m[0][1] * m[2][2]) / (double) det;
        res[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / (double) det;
        res[1][0] = (m[1][2] * m[2][0] - m[1][0] * m[2][2]) / (double) det;
        res[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / (double) det;
        res[1][2] = (m[0][2] * m[1][0] - m[0][0] * m[1][2]) / (double) det;
        res[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / (double) det;
        res[2][1] = (m[0][1] * m[2][0] - m[0][0] * m[2][1]) / (double) det;
        res[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / (double) det;
        return res;
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static void display(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = createMatrix(2, 2);
        int[][] b = createMatrix(2, 2);
        System.out.println("Matrix A:");
        display(a);
        System.out.println("Matrix B:");
        display(b);

        System.out.println("Addition:");
        display(add(a, b));

        System.out.println("Subtraction:");
        display(subtract(a, b));

        System.out.println("Multiplication:");
        display(multiply(a, b));

        System.out.println("Transpose of A:");
        display(transpose(a));

        System.out.println("Determinant of A: " + determinant2x2(a));

        System.out.println("Inverse of A:");
        display(inverse2x2(a));
    }
}





