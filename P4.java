import java.util.*;

class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        long t1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append(s);
        }
        long t2 = System.nanoTime();
        
        long t3 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append(s);
        }
        long t4 = System.nanoTime();
        
        System.out.println("StringBuffer time: " + (t2 - t1) + " ns");
        System.out.println("StringBuilder time: " + (t4 - t3) + " ns");
    }
}
