import java.util.*;

class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] w = new double[n];
        double[] h = new double[n];
        double[] b = new double[n];
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble();
            h[i] = sc.nextDouble();

            b[i] = w[i] / (h[i] * h[i]);

            if (b[i] <= 18.4) {
                s[i] = "underweight";
            } else if (b[i] >= 18.5 && b[i] <= 24.9) {
                s[i] = "normal";
            } else if (b[i] >= 25.0 && b[i] <= 39.9) {
                s[i] = "overweight";
            } else {
                s[i] = "obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s\n", 
                i + 1, h[i], w[i], b[i], s[i]);
        }
    }
}
