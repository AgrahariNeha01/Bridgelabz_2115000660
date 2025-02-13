import java.util.*;

public class P6 {
    static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int sum = 0;

        mp.put(0, new ArrayList<>());
        mp.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (!mp.containsKey(sum)) {
                mp.put(sum, new ArrayList<>());
            }

            for (int index : mp.get(sum)) {
                System.out.println("Subarray: " + (index + 1) + " to " + i);
            }

            mp.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        findZeroSumSubarrays(arr);
    }
}
