import java.util.*;

class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] a = new int[3];
        double[] h = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + n[i] + ": ");
            a[i] = sc.nextInt();
            System.out.print("Enter height of " + n[i] + ": ");
            h[i] = sc.nextDouble();
        }

        int yIdx = 0, tIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (a[i] < a[yIdx]) {
                yIdx = i;
            }
            if (h[i] > h[tIdx]) {
                tIdx = i;
            }
        }

        System.out.println("Youngest friend: " + n[yIdx]);
        System.out.println("Tallest friend: " + n[tIdx]);
    }
}
