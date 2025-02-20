import java.util.HashMap;
import java.util.LinkedList;

public class P2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("cherry");
        ll.add("apple");
        ll.add("orange");
        HashMap<String, Integer> mp = new HashMap<>();
        for (String s : ll) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        for (HashMap.Entry<String, Integer> ele : mp.entrySet()) {
            System.out.print(ele.getKey()+" = "+ ele.getValue()+", ");
        }

    }

}
