package Java_String;

import java.util.*;

class P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[][] w = new char[a.length][a.length];
        int x = 0, y = 0, l_x = 0, l_y = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                if (y > l_y) {
                    l_x = x - 1;
                    l_y = y;
                }
                x++;
                y = 0;
            } else {
                w[x][y++] = a[i];
            }
        }

        if (y > l_y) {
            l_x = x;
            l_y = y;
        }

        for (int i = 0; i < l_y; i++) {
            System.out.print(w[l_x][i]);
        }
    }
}
