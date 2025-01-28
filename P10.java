import java.util.*;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int kids = sc.nextInt();
        int[] res = findRemainderAndQuotient(ch, kids);
        System.out.println("Chocolates per child: " + res[0]);
        System.out.println("Remaining chocolates: " + res[1]);
    }

    public static int[] findRemainderAndQuotient(int ch, int kids) {
        int p_c = ch / kids;
        int rem = ch % kids;
        return new int[]{p_c, rem};
    }
}

