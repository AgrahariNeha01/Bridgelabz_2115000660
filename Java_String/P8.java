package Java_String;

import java.util.*;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int l1 = a.length(), l2 = b.length();
        int sm = (l1 < l2) ? l1 : l2; 

        for (int i = 0; i < sm; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println(a + " comes before " + b + " in lexicographical order");
                return;
            } else if (a.charAt(i) > b.charAt(i)) {
                System.out.println(b + " comes before " + a + " in lexicographical order");
                return;
            }
        }

        if (l1 < l2) {
            System.out.println(a + " comes before " + b + " in lexicographical order");
        } else if (l1 > l2) {
            System.out.println(b + " comes before " + a + " in lexicographical order");
        } else {
            System.out.println(a + " and " + b + " are equal");
        }
    }
}

