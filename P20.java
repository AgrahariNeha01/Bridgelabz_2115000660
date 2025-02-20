import java.util.*;

class P20 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);

        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (var entry : map2.entrySet()) {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        System.out.println(mergedMap);
    }
}
