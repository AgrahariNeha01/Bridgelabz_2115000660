import java.util.*;

class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] pData = new double[n][3];
        String[] wStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;

            do {
                w = sc.nextDouble();
            } while (w <= 0);

            do {
                h = sc.nextDouble();
            } while (h <= 0);

            pData[i][0] = w;
            pData[i][1] = h;
            pData[i][2] = w / (h * h);

            if (pData[i][2] <= 18.4) {
                wStatus[i] = "underweight";
            } else if (pData[i][2] >= 18.5 && pData[i][2] <= 24.9) {
                wStatus[i] = "normal";
            } else if (pData[i][2] >= 25.0 && pData[i][2] <= 39.9) {
                wStatus[i] = "overweight";
            } else {
                wStatus[i] = "obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s\n",
                    i + 1, pData[i][1], pData[i][0], pData[i][2], wStatus[i]);
        }
    }
}
