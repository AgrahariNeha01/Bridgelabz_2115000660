import java.util.*;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int c = NC.cntD(num);
        int[] d = NC.storeD(num);
        int[] r = NC.reverseD(d);
        boolean p = NC.isP(d);
        boolean dck = NC.isDck(d);
        boolean eq = NC.compareArr(d, r);

        System.out.println("Count of digits: " + c);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed Digits: " + Arrays.toString(r));
        System.out.println("Is Palindrome: " + p);
        System.out.println("Is Duck Number: " + dck);
        System.out.println("Are arrays equal: " + eq);
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

    public static int[] reverseD(int[] d) {
        int[] rev = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            rev[i] = d[d.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArr(int[] d1, int[] d2) {
        return Arrays.equals(d1, d2);
    }

    public static boolean isP(int[] d) {
        int[] rev = reverseD(d);
        return compareArr(d, rev);
    }

    public static boolean isDck(int[] d) {
        for (int i : d) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }
}

