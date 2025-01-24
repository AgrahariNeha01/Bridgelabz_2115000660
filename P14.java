import java.util.*;

class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int temp = n;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] d = new int[count];
        int[] rev = new int[count];
        int i = 0;

        while (n != 0) {
            d[i] = n % 10;
            n /= 10;
            i++;
        }

        for (int j = 0; j < count; j++) {
            rev[j] = d[count - 1 - j];
        }

        for (int j = 0; j < count; j++) {
            System.out.print(rev[j]);
        }
    }
}


