import java.util.*;

class MyHashmap {
    private static class Node {
        int k, v;
        Node next;
        Node(int k, int v) { this.k = k; this.v = v; }
    }

    private Node[] table;
    private int size = 1000;

    public MyHashmap() {
        table = new Node[size]; 
    }

    private int hash(int k) { return k % size; }

    public void put(int k, int v) {
        int idx = hash(k);
        if (table[idx] == null) {
            table[idx] = new Node(k, v);
            return;
        }
        Node cur = table[idx];
        while (cur != null) {
            if (cur.k == k) {
                cur.v = v;
                return;
            }
            if (cur.next == null) break;
            cur = cur.next;
        }
        cur.next = new Node(k, v); 
    }

    public int get(int k) {
        int idx = hash(k);
        Node cur = table[idx];
        while (cur != null) {
            if (cur.k == k) return cur.v;
            cur = cur.next;
        }
        return -1;
    }

    public void remove(int k) {
        int idx = hash(k);
        Node cur = table[idx], prev = null;
        while (cur != null) {
            if (cur.k == k) {
                if (prev == null) table[idx] = cur.next;
                else prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}

public class P9 {
    public static void main(String[] args) {
        MyHashmap mp = new MyHashmap();

        mp.put(1, 100);
        mp.put(2, 200);
        System.out.println(mp.get(1));
        System.out.println(mp.get(3));
        mp.remove(1);
        System.out.println(mp.get(1));
    }
}
