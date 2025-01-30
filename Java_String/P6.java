package Java_String;

import java.util.*;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        int c = 0;

        for (int i = 0; i <= a.length - b.length; i++) {
            boolean f = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    f = false;
                    break;
                }
            }
            if (f) c++;
        }

        System.out.println(c);
    }
}

