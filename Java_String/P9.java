package Java_String;

import java.util.*;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }
        
        int mF = 0;
        char mC = '\0';
        
        for (int i = 0; i < s.length(); i++) {
            if (f[s.charAt(i)] > mF) {
                mF = f[s.charAt(i)];
                mC = s.charAt(i);
            }
        }
        
        System.out.println("Most Frequent Character: '" + mC + "'");
    }
}

