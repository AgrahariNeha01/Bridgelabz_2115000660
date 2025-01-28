import java.util.*;

public class P24 {

    public static int[] generate4DigitRandomArray(int s) {
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAvgMinMax(int[] arr) {
        double avg = 0;
        int min = arr[0], max = arr[0];
        
        for (int n : arr) {
            avg += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        avg /= arr.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] rArr = generate4DigitRandomArray(5);
        double[] res = findAvgMinMax(rArr);
    }
}




