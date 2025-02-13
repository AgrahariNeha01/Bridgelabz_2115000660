import java.util.*;

public class P8 {
    public int L_c_seq(int[] arr) {
        int max_seq = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int x : arr) {
            if (mp.containsKey(x)) continue;
            
            int l = mp.getOrDefault(x - 1, 0);
            int r = mp.getOrDefault(x + 1, 0);
            int seq_len = l + r + 1;
            
            mp.put(x, seq_len);
            mp.put(x - l, seq_len);
            mp.put(x + r, seq_len);
            
            max_seq = Math.max(max_seq, seq_len);
        }
        return max_seq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        P8 obj = new P8();
        System.out.println(obj.L_c_seq(arr));
        
        sc.close();
    }
}
