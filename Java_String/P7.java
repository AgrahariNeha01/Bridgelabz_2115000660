package Java_String;

import java.util.*;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder r = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) r.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) r.append(Character.toUpperCase(ch));
            else r.append(ch);
        }

        System.out.println(r);
    }
}
