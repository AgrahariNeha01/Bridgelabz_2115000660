package Java_String;

import java.util.*;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                res.append(s.charAt(i));
            }
        }
        
        System.out.println("Modified String: " + res.toString());
    }
}
