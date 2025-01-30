package Java_String;

import java.util.*;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                res = res.concat(s.substring(i, i + 1));
            }
        }

        System.out.println("Modified String: " + res);
    }
}



