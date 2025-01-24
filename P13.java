import java.util.*;

class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxD = 10;
        int[] d = new int[maxD];
        int i = 0;

        while (n != 0 && i < maxD) {
            d[i] = n % 10;
            n /= 10;
            i++;
        }

        int l = 0, sl = 0;

        for (int j = 0; j < i; j++) {
            if (d[j] > l) {
                sl = l;
                l = d[j];
            } else if (d[j] > sl && d[j] != l) {
                sl = d[j];
            }
        }

        System.out.println("Largest digit: " + l);
        System.out.println("Second largest digit: " + sl);
    }
}
