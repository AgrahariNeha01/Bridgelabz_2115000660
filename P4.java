import java.util.*;
 class Sliding_Window_Max {
    public static int[] max_Window(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Window se bahar wale element ko hatao
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Peeche se chhote elements ko hatao (kyunki wo kabhi max nahi ban sakte)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Naya index add karo
            dq.offerLast(i);

            // Answer tabhi store karenge jab first window complete ho jaye
            if (i >= k - 1) {
                res[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        return res;
    }
}

public class P4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = Sliding_Window_Max.max_Window(arr, k);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
