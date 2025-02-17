import java.util.*;

public class P3 {
    static void testString(int n) {
        long s = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) str += "a";
        long e = System.nanoTime();
        System.out.println("String: " + (e - s) + " ns");
    }

    static void testStringBuilder(int n) {
        long s = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        long e = System.nanoTime();
        System.out.println("StringBuilder: " + (e - s) + " ns");
    }

    static void testStringBuffer(int n) {
        long s = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("a");
        long e = System.nanoTime();
        System.out.println("StringBuffer: " + (e - s) + " ns");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        testString(n);
        testStringBuilder(n);
        testStringBuffer(n);
    }
}
