package Java_String;

import java.util.*;



class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] r = new char[a.length]; 
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            boolean f = false;
            for (int j = 0; j < x; j++) {
                if (r[j] == a[i]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                r[x++] = a[i];
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.print(r[i]);
        }
    }
}
