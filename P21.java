
import java.util.*;

public class P21 {

    public static String isPos(int n) {
        return n >= 0 ? "pos" : "neg";
    }

    public static String isEven(int n) {
        return n % 2 == 0 ? "even" : "odd";
    }

    public static int cmp(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            String res = isPos(nums[i]);
            if (res.equals("pos")) {
                isEven(nums[i]);
            } else {
                            }
        }

        int cmpRes = cmp(nums[0], nums[4]);
        sc.close();
    }
}


