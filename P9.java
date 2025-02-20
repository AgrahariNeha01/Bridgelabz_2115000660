import java.util.*;

public class P9 {
    static List<Integer> convertToSortedList(Set<Integer> s) {
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        return l;
    }

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Sorted List: " + convertToSortedList(s));
    }
}
