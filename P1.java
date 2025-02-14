import java.util.*;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        
        for (int i = 0; i < n; i++) 
            m[i] = sc.nextInt();
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (m[j] > m[j + 1]) {
                    int t = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (int i : m) 
            System.out.print(i + " ");
            sc.close();
    }
}
