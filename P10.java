import java.util.*;

public class P10 {
    static boolean isSubset(Set<Integer> s1, Set<Integer> s2) {
        return s2.containsAll(s1);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(isSubset(s1, s2));
    }
}
