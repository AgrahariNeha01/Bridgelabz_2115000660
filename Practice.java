import java.util.*;

class MyHashMap<K, V> {
    private LinkedList<Node>[] barr;
    private int size;
    private int capacity;

    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    // Constructor - Initial capacity set to 4
    public MyHashMap() {
        capacity = 4;
        barr = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++)
            barr[i] = new LinkedList<>();
        size = 0;
    }

    // Hash function to get bucket index (0 to N-1)
    private int hashFunction(K key) {
        int bi = key.hashCode();// Generates hash code
        return Math.abs(bi) % capacity;// Reduce the hash code to the range of capacity
    }

    // Search for key in LinkedList (returns index if found, else -1)
    private int searchInll(K key, int bi) {
        LinkedList<Node> ll = barr[bi];
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key.equals(key))
                return i;
        }
        return -1;
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int bi = hashFunction(key); // get bucket index
        int di = searchInll(key, bi); // search in ll

        if (di == -1) {
            // Key not found → Insert new node
            barr[bi].add(new Node(key, value));
            size++;
        } else {
            // key found , update value
            barr[bi].get(di).value = value;
        }

        // Check if rehashing is needed
        if ((1.0 * size) / capacity > 0.7)
            rehash();
    }

    private void rehash() {
        LinkedList<Node>[] oldBarr = barr;
        capacity *= 2; // double size
        barr = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            barr[i] = new LinkedList<>();
        }
        size = 0;
        for (LinkedList<Node> ll : oldBarr) {
            for (Node node : ll) {
                put(node.key, node.value); // reinsert elements
            }

        }
    }

    public V get(K key) {
        int bi = hashFunction(key);
        int di = searchInll(key, bi);
        return (di == -1) ? null : barr[bi].get(di).value;
    }

    public V remove(K key) {
        int bi = hashFunction(key);
        int di = searchInll(key, bi);
        if (di == -1)
            return null; // key not found
        Node removNode = barr[bi].remove(di);
        size--;
        return removNode.value;
    }

    public boolean containsKey(K key) {
        return searchInll(key, hashFunction(key)) != -1;

    }

    public int size() {
        return size;
    }
}

public class Practice {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Orange", 70);

        System.out.println(map.get("Apple")); // Output: 100
        System.out.println(map.containsKey("Banana")); // Output: true
        map.remove("Banana");
        System.out.println(map.containsKey("Banana")); // Output: false
    }
}
