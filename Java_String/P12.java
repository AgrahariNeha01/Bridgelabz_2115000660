package Java_String;

import java.util.*;

class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String oW = sc.next();
        String nW = sc.next();
        
        String res = rep(s, oW, nW);
        System.out.println("Modified Sentence: " + res);
    }

    public static String rep(String s, String oW, String nW) {
        String result = "";
        int len = s.length();
        int i = 0;
        
        while (i < len) {
            if (i + oW.length() <= len && s.substring(i, i + oW.length()).equals(oW)) {
                result += nW;
                i += oW.length();
            } else {
                result += s.charAt(i);
                i++;
            }
        }
        
        return result;
    }
}
