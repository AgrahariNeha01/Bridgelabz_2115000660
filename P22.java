import java.util.*;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0, num;

        while (true) {
            num = sc.nextDouble();
            
            if (num == 0) {
                break;
            }
            
            sum += num;
        }

        System.out.println("Total sum "+sum);
        sc.close();
    }
}
