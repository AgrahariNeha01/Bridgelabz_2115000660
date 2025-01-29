package Java_String;

import java.util.*;

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] w = sc.nextLine().split(" ");
        String l = "";
        
        for (String s : w) {
            if (s.length() > l.length()) l = s;
        }
        
        System.out.println(l);
    }
}
