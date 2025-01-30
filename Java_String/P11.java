package Java_String;

import java.util.*;

class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();
        
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    char t = a1[i];
                    a1[i] = a1[j];
                    a1[j] = t;
                }
            }
        }
        
        for (int i = 0; i < a2.length; i++) {
            for (int j = i + 1; j < a2.length; j++) {
                if (a2[i] > a2[j]) {
                    char t = a2[i];
                    a2[i] = a2[j];
                    a2[j] = t;
                }
            }
        }
        
        boolean anagram = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                anagram = false;
                break;
            }
        }
        
        if (anagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
