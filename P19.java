import java.util.*;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        
        boolean Is_Spring = (M == 3 && D>= 20 && D <= 31) || 
                           (M == 4 && D>= 1 && D <= 30) || 
                           (M == 5 && D>= 1 && D <= 31) || 
                           (M == 6 && D>= 1 && D <= 20);

        if (Is_Spring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
