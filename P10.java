import java.util.*;

class P10 {
    public int[] twoSum(int[] arr, int t) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int check = t - arr[i];
            if (mp.containsKey(check)) {
                return new int[]{mp.get(check), i};
            }
            mp.put(arr[i], i);
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        P10 obj = new P10();
        int[] arr = {2, 7, 11, 15};
        int t = 9;

        int[] res = obj.twoSum(arr, t);
        if (res[0] != -1) {
            System.out.println(res[0] + " " + res[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
