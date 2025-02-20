import java.util.*;

public class P5 {
    static String findNthFromEnd(LinkedList<String> l, int N) {
        Iterator<String> fast = l.iterator();
        Iterator<String> slow = l.iterator();

        for (int i = 0; i < N; i++) {
            if (!fast.hasNext()) return "N is larger than list size";
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;

        System.out.println(findNthFromEnd(l, N));
    }
}
