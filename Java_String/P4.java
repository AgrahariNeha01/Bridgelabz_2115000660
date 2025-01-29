package Java_String;

import java.util.*;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder r = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                r.append(ch);
            }
        }

        System.out.println(r);
    }
}
