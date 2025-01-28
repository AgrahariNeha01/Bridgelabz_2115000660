import java.util.*;

public class P22 {

    public static double[][] calcBMI(double[][] arr) {
        for (int i = 0; i < 10; i++) {
            double w = arr[i][0];
            double h = arr[i][1] / 100;
            double bmi = w / (h * h);
            arr[i][2] = bmi;
        }
        return arr;
    }

    public static String[] getStatus(double[][] arr) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = arr[i][2];
            if (bmi <= 18.4) status[i] = "underweight";
            else if (bmi <= 24.9) status[i] = "normal";
            else if (bmi <= 39.9) status[i] = "overweight";
            else status[i] = "obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] p = new double[10][3];

        for (int i = 0; i < 10; i++) {
            p[i][0] = sc.nextDouble();
            p[i][1] = sc.nextDouble();
        }

        calcBMI(p);
        String[] s = getStatus(p);

        sc.close();
    }
}

