import java.util.*;

public class P27 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();


        int c = NC.cntD(num);
        int[] d = NC.storeD(num);
        int s = NC.sumD(d);
        int sq = NC.sumSq(d);
        boolean h = NC.isH(num, d);
        int[][] f = NC.digitF(d);

        System.out.println("Count of digits: " + c);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Sum of digits: " + s);
        System.out.println("Sum of squares of digits: " + sq);
        System.out.println("Is Harshad Number: " + h);
        System.out.println("Frequency of each digit: ");
        for (int[] x : f) {
            System.out.println(x[0] + " => " + x[1]);
        }
    }
}

class NC {
    public static int cntD(int num) {
        return Integer.toString(num).length();
    }

    public static int[] storeD(int num) {
        String numStr = Integer.toString(num);
        int[] d = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            d[i] = numStr.charAt(i) - '0';
        }
        return d;
    }

    public static int sumD(int[] d) {
        int sum = 0;
        for (int i : d) {
            sum += i;
        }
        return sum;
    }

    public static int sumSq(int[] d) {
        int sum = 0;
        for (int i : d) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static boolean isH(int num, int[] d) {
        int sum = sumD(d);
        return num % sum == 0;
    }

    public static int[][] digitF(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i : d) {
            freq[i][1]++;
        }

        return Arrays.stream(freq).filter(x -> x[1] > 0).toArray(int[][]::new);
    }
}



