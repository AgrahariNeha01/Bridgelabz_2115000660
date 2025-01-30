package Java_String;

import java.util.*;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = ("" + a[i]).toLowerCase().charAt(0);
            } else if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = ("" + a[i]).toUpperCase().charAt(0);
            }
            System.out.print(a[i]);
        }
    }
}

