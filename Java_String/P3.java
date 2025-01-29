package Java_String;

import java.util.*;

class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean p = true;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                p = false;
                break;
            }
        }

        System.out.println(p ? "Yes" : "No");
    }
}
