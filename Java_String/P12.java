package Java_String;

import java.util.*;

class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String oW = sc.next();
        String nW = sc.next();
        
        String res = replace(sen, oW, nW);
        System.out.println("Modified Sentence: " + res);
    }

    public static String replace(String sen, String oW, String nW) {
        return sen.replace(oW, nW);
    }
}
