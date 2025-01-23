import java.util.*;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A >= 18) {
            System.out.println("The person's age is " + A + " and can vote.");
        } else {
            System.out.println("The person's age is " + A + " and cannot vote.");
        }
        
        sc.close();
    }
}
