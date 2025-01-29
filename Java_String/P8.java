package Java_String;

import java.util.*;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);
        
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(s1 + " comes before " + s2 + " in lexicographical order");
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(s2 + " comes before " + s1 + " in lexicographical order");
                return;
            }
        }
        
        if (len1 < len2) {
            System.out.println(s1 + " comes before " + s2 + " in lexicographical order");
        } else if (len1 > len2) {
            System.out.println(s2 + " comes before " + s1 + " in lexicographical order");
        } else {
            System.out.println(s1 + " and " + s2 + " are equal");
        }
    }
}

