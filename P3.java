import java.util.*;

class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < n; i++) {
            sb.append(sc.next());
        }
        
        System.out.println(sb.toString());
    }
}
