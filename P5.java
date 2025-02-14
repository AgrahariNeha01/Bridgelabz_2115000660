import java.util.*;

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) 
            s[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (s[j] < s[min]) min = j;
            }
            int t = s[i];
            s[i] = s[min];
            s[min] = t;
        }

        for (int i : s) 
            System.out.print(i + " ");
    }
}
