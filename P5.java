import java.util.*;

public class P5 {
    public static void main(String[] args) {
        String str = getInpt();
        boolean isPalin = chkPalin(str);
        dispRes(isPalin);
    }

    static String getInpt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean chkPalin(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    static void dispRes(boolean isPalin) {
        if (isPalin) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
