
import java.util.*;

public class P26 {
    public static void main(String[] args) {
        int num = 153;

        int c = NumberChecker.cntDigits(num);
        int[] d = NumberChecker.storeDigits(num);
        boolean duck = NumberChecker.isDuck(d);
        boolean arm = NumberChecker.isArmstrong(num, d);
        int[] l = NumberChecker.findLrgSecLrg(d);
        int[] s = NumberChecker.findSmSecSm(d);

        System.out.println("Count of digits: " + c);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Is Duck Number: " + duck);
        System.out.println("Is Armstrong Number: " + arm);
        System.out.println("Largest and Second Largest: " + Arrays.toString(l));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(s));
    }
}

class NumberChecker {
    public static int cntDigits(int num) {
        return Integer.toString(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = Integer.toString(num);
        int[] d = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            d[i] = numStr.charAt(i) - '0';
        }
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int i : d) {
            if (i != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] d) {
        int sum = 0;
        int n = d.length;
        for (int i : d) {
            sum += Math.pow(i, n);
        }
        return sum == num;
    }

    public static int[] findLrgSecLrg(int[] d) {
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int i : d) {
            if (i > l) {
                sl = l;
                l = i;
            } else if (i > sl && i != l) {
                sl = i;
            }
        }
        return new int[]{l, sl};
    }

    public static int[] findSmSecSm(int[] d) {
        int sm = Integer.MAX_VALUE, secSm = Integer.MAX_VALUE;
        for (int i : d) {
            if (i < sm) {
                secSm = sm;
                sm = i;
            } else if (i < secSm && i != sm) {
                secSm = i;
            }
        }
        return new int[]{sm, secSm};
    }
}



