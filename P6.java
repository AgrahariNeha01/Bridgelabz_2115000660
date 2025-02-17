import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = n / 2;

        long s1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) break;
        }
        long e1 = System.nanoTime();
        System.out.println("Array Search: " + (e1 - s1) / 1_000_000 + " ms");

        long s2 = System.nanoTime();
        hashSet.contains(target);
        long e2 = System.nanoTime();
        System.out.println("HashSet Search: " + (e2 - s2) / 1_000_000 + " ms");

        long s3 = System.nanoTime();
        treeSet.contains(target);
        long e3 = System.nanoTime();
        System.out.println("TreeSet Search: " + (e3 - s3) / 1_000_000 + " ms");
    }
}
