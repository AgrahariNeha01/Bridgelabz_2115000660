import java.util.*;

public class P7 {
    static Set<Integer> findUnion(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        return union;
    }

    static Set<Integer> findIntersection(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Union: " + findUnion(s1, s2));
        System.out.println("Intersection: " + findIntersection(s1, s2));
    }
}
