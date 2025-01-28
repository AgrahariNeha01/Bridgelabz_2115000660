import java.util.*;

public class P25 {
    public static void main(String[] args) {
        int[] h = new int[11];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < h.length; i++) {
                       h[i] = sc.nextInt();
        }

        int s = getSum(h);
        double m = getMean(s, h.length);
        int sm = getShortest(h);
        int lrg = getTallest(h);

        System.out.println("Heights: " + Arrays.toString(h));
        System.out.println("Sum: " + s);
        System.out.println("Mean: " + m);
        System.out.println("Shortest: " + sm);
        System.out.println("Tallest: " + lrg);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getMean(int sum, int n) {
        return (double) sum / n;
    }

    public static int getShortest(int[] arr) {
        int sm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < sm) {
                sm = arr[i];
            }
        }
        return sm;
    }

    public static int getTallest(int[] arr) {
        int lrg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lrg) {
                lrg = arr[i];
            }
        }
        return lrg;
    }
}
