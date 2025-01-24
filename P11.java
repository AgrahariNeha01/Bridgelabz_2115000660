import java.util.*;

class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        double[] s = new double[n];
        double[] y = new double[n];
        double[] b = new double[n];
        double[] ns = new double[n];
        
        double tsb = 0.0, tos = 0.0, tns = 0.0;

        for (int i = 0; i < n; i++) {
            while (true) {
                s[i] = sc.nextDouble();
                if (s[i] <= 0) {
                    continue;
                }
                break;
            }
            
            while (true) {
                y[i] = sc.nextDouble();
                if (y[i] < 0) {
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            b[i] = (y[i] > 5) ? s[i] * 0.05 : s[i] * 0.02;
            ns[i] = s[i] + b[i];

            tsb += b[i];
            tos += s[i];
            tns += ns[i];
        }

        System.out.println("\nTotal Bonus: " + tsb);
        System.out.println("Total Old Salary: " + tos);
        System.out.println("Total New Salary: " + tns);
    }
}
