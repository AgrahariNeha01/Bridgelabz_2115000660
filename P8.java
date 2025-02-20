import java.util.*;

public class P8 {
    static Set<Integer> findSymmetricDifference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> diff = new HashSet<>(s1);
        diff.addAll(s2);

        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        diff.removeAll(intersection);
        return diff;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric Difference: " + findSymmetricDifference(s1, s2));
    }
}
