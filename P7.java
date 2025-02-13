import java.util.*;

public class P7 {
    public boolean chk_pair(int[] arr, int t) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int chk = t - arr[i];
            if (mp.containsKey(chk)) {
                return true;
            }
            mp.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        P7 obj = new P7();
        System.out.println(obj.chk_pair(arr, t));
    }
}
